public class FanArtistAdapter extends RecyclerView.Adapter<FanArtistAdapter.ViewHolder> {
    private List<FanArtist> artistList;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name, greeting, emoji;

        public ViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.artistName);
            greeting = view.findViewById(R.id.greeting);
            emoji = view.findViewById(R.id.emoji);
        }
    }

    public FanArtistAdapter(List<FanArtist> artists) {
        this.artistList = artists;
    }

    @Override
    public FanArtistAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_fan_artist, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        FanArtist artist = artistList.get(position);
        holder.name.setText(artist.getName());
        holder.greeting.setText(artist.getGreeting());
        holder.emoji.setText(artist.getEmoji());
    }

    @Override
    public int getItemCount() {
        return artistList.size();
    }
}