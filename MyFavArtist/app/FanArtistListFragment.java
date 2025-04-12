package com.MyFavArtist;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

public class FanArtistListFragment extends Fragment {

    private RecyclerView recyclerView;
    private FanArtistAdapter adapter;

    public FanArtistListFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fan_artist_list, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<FanArtist> fanArtists = Arrays.asList(
                new FanArtist("ATEEZ", "Hi!!", "☺"),
                new FanArtist("SEONGHWA", "Hi!!", "☺"),
                new FanArtist("HONGJOONG", "Hi!", "☺"),
                new FanArtist("YUNHO", "Hello!", "≧ω≦"),
                new FanArtist("YEOSANG", "Hello!", "≧▽≦"),
                new FanArtist("SAN", "Hello!", "≧◡≦"),
                new FanArtist("MINGI", "Hi!", "≧◡≦"),
                new FanArtist("WOOYOUNG", "Hi!", "≧ω≦"),
                new FanArtist("JONGHO", "Hi!!", "☺")
        );

        adapter = new FanArtistAdapter(fanArtists);
        recyclerView.setAdapter(adapter);
        return view;
    }
}


On Sat, 12 Apr 2025, 9:16 pm Saira Asmajin, <sasmajin@gmail.com> wrote:
        package com.MyFavArtist;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

public class FanArtistListFragment extends Fragment {

    private RecyclerView recyclerView;
    private FanArtistAdapter adapter;

    public FanArtistListFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fan_artist_list, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<FanArtist> fanArtists = Arrays.asList(
                new FanArtist("ATEEZ", "Hi!!", "☺"),
                new FanArtist("SEONGHWA", "Hi!!", "☺"),
                new FanArtist("HONGJOONG", "Hi!", "☺"),
                new FanArtist("YUNHO", "Hello!", "≧ω≦"),
                new FanArtist("YEOSANG", "Hello!", "≧▽≦"),
                new FanArtist("SAN", "Hello!", "≧◡≦"),
                new FanArtist("MINGI", "Hi!", "≧◡≦"),
                new FanArtist("WOOYOUNG", "Hi!", "≧ω≦"),
                new FanArtist("JONGHO", "Hi!!", "☺")
        );

        adapter = new FanArtistAdapter(fanArtists);
        recyclerView.setAdapter(adapter);
        return view;
    }
}