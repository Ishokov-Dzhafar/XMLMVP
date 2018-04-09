package com.test.xmlmvp.view.Fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.MainThread;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.test.xmlmvp.R;
import com.test.xmlmvp.presenter.HabrFragmentPresenterImpl;
import com.test.xmlmvp.presenter.Interface.HabrFragmentPresenter;
import com.test.xmlmvp.model.response.Rss;
import com.test.xmlmvp.view.Interface.HabrFragmentView;
import com.test.xmlmvp.view.adapters.HabrListAdapter;

/**
 * Created by dzhafar on 07.04.18.
 */

public class HabrFragment extends Fragment implements HabrFragmentView {

    private HabrFragmentPresenter presenter;
    private RecyclerView habrList;
    private HabrListAdapter adapter;
    private SwipeRefreshLayout swipeContainer;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.habr_fragment, container, false);
        if (savedInstanceState == null) {
            presenter = new HabrFragmentPresenterImpl(this);
            adapter = new HabrListAdapter();
        }
        swipeContainer = (SwipeRefreshLayout) view.findViewById(R.id.swipeContainer);
        habrList = (RecyclerView) view.findViewById(R.id.habrList);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        habrList.setLayoutManager(llm);
        habrList.setAdapter(adapter);
        swipeContainer.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                presenter.getHabrData();
            }
        });
        swipeContainer.setColorSchemeResources(android.R.color.holo_blue_dark);

        return view;
    }

    @Override
    public void onSuccessRequest(Rss result) {
        getActivity().setTitle(result.getChannel().getTitle());
        adapter.setData(result.getChannel().getItem());
        swipeContainer.setRefreshing(false);
    }

    @Override
    public void showError(String message) {
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
        swipeContainer.setRefreshing(false);
    }
}
