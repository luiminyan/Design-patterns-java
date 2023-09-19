public class FilterThreeTimes extends FilterDecorator{
    public FilterThreeTimes(IFilter iFilter) {
        super(iFilter, 3);
    }

    @Override
    public void anwenden() {
        for (int i = 0; i < times; i++) {
            iFilter.anwenden();
        }
    }
}
