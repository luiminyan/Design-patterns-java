public class FilterFiveTimes extends FilterDecorator{
    public FilterFiveTimes(IFilter iFilter) {
        super(iFilter, 5);
    }

    @Override
    public void anwenden() {
        for (int i = 0; i < times; i++) {
            iFilter.anwenden();
        }
    }
}
