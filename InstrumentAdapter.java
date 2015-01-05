public class InstrumentAdapter extends
RecyclerView.Adapter < InstrumentAdapter.InstrumentViewHolder > {

	private List < Instrument > InstrumentList;

	public InstrumentAdapter(List < Instrument > InstrumentList) {
		this.InstrumentList = InstrumentList;
	}

	@Override
	public int getItemCount() {
		return Instrument.size();
	}

	@Override
	public void onBindViewHolder(InstrumentViewHolder InstrumentViewHolder, int i) {
		InstrumentInfo ci = InstrumentList.get(i);
		InstrumentViewHolder.vdescription.setText(ci.description);
		InstrumentViewHolder.vlastTradedPrice.setText(ci.lastTradedPrice);
		InstrumentViewHolder.vlowerLimit.setText(ci.lowerLimit);
		InstrumentViewHolder.vhigherLimit.setText(ci.higherLimit);
	}

	@Override
	public InstrumentViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
		View itemView = LayoutInflater.from(viewGroup.getContext()).
		inflate(R.layout.card_layout, viewGroup, false);
		return new InstrumentViewHolder(itemView);
	}

	public static class InstrumentViewHolder extends RecyclerView.ViewHolder {

		protected TextView vdescription;
		protected TextView vlastTradedPrice;
		protected TextView vlowerLimit;
		protected TextView vhigherLimit;

		public InstrumentViewHolder(View v) {
			super(v);
			vdescription = (TextView) v.findViewById(R.id.description);
			vlastTradedPrice = (TextView) v.findViewById(R.id.lastTradedPrice);
			vlowerLimit = (TextView) v.findViewById(R.id.lowerLimit);
			vhigherLimit = (TextView) v.findViewById(R.id.higherLimit);
		}
	}


}
