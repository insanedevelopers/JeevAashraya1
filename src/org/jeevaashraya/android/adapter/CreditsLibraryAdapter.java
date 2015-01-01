package org.jeevaashraya.android.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;


public class CreditsLibraryAdapter extends BaseAdapter {

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}
/*
	private Context mContext;
	private List<CreditsLibraryItem> mLibraries;
	private onAvatarClickListener mListener;
	
	public CreditsLibraryAdapter(Context context) {
		this(context, new ArrayList<CreditsLibraryItem>());
	}
	
	public CreditsLibraryAdapter(Context context, List<CreditsLibraryItem> libraries) {
		this.mContext = context;
		this.mLibraries = libraries;
	}
	
	public void addItem(CreditsLibraryItem library)
	{
		this.mLibraries.add(library);
	}
	
	public void setOnAvatarClickListener(onAvatarClickListener listener)
	{
		this.mListener = listener;
	}

	@Override
	public int getCount()
	{
		return mLibraries.size();
	}

	@Override
	public CreditsLibraryItem getItem(int position)
	{
		return mLibraries.get(position);
	}

	@Override
	public long getItemId(int position)
	{
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		final CreditsLibraryItem mLibrary = mLibraries.get(position);
		ViewHolder holder;
		
		if (convertView == null) {
			LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = mInflater.inflate(R.layout.dialog_libraries, parent, false);
			
			holder = new ViewHolder();
			holder.mCard = (RelativeLayout) convertView.findViewById(R.id.Card);
			holder.imgAvatar = (CircularImageView) convertView.findViewById(R.id.imgAvatar);
			holder.txtTitle = (TextView) convertView.findViewById(R.id.txtTitle);
			holder.txtAuthor = (TextView) convertView.findViewById(R.id.txtAuthor);
			holder.txtLicense = (TextView) convertView.findViewById(R.id.txtLicense);
			holder.btnExpCol = (ImageView) convertView.findViewById(R.id.btnExpCol);
			
			convertView.setTag(holder);
		}
		else {
			holder = (ViewHolder) convertView.getTag();
		}
		
		holder.mCard.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mLibrary.setExpanded(!mLibrary.isExpanded());
				notifyDataSetChanged();
			}
		});
		
		Picasso.with(mContext).load(mLibrary.getAvatar()).error(R.drawable.dev_avatar).transform(new RoundTransform(0, 0)).into(holder.imgAvatar);
		holder.imgAvatar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if(mListener != null) {
					mListener.onClick(mLibrary.getLink());
				}
			}
		});
		
		holder.txtTitle.setText(mLibrary.getTitle());
		holder.txtAuthor.setText(mLibrary.getAuthor());
		holder.txtLicense.setText(mLibrary.getLicense());
		
		holder.txtLicense.setVisibility(mLibrary.isExpanded() ? View.VISIBLE : View.GONE);
		holder.btnExpCol.setImageResource(mLibrary.isExpanded() ? R.drawable.ic_up : R.drawable.ic_down);
		
		return convertView;
	}
	
	private class ViewHolder {
		public RelativeLayout mCard;
		public CircularImageView imgAvatar;
		public TextView txtTitle;
		public TextView txtAuthor;
		public TextView txtLicense;
		public ImageView btnExpCol;
	}
	
	public interface onAvatarClickListener {
		void onClick(Uri link);
	}*/

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		return null;
	}
}