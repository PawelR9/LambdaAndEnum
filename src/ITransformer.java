@FunctionalInterface
public interface ITransformer<R, T> {
    R transform(T input);
}
