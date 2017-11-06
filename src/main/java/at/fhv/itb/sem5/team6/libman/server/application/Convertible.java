package at.fhv.itb.sem5.team6.libman.server.application;

import javax.validation.constraints.NotNull;

/**
 * supports up- and down-casts between model hierarchies
 * <p>
 * EXAMPLE USAGE:
 * // data
 * ImmutableMedia i = new Media();
 * MutableMedia m = new Media();
 * Media o = new Media();
 * <p>
 * // immutable conversions
 * Media oi = CastDown(i);
 * MutableMedia mi = CastDown(i);
 * <p>
 * // mutable conversions
 * Media om = CastDown(m);
 * ImmutableMedia im = CastUp(m);
 * <p>
 * // model conversions
 * ImmutableMedia io = CastUp(o);
 * MutableMedia mo = CastUp(o);
 */
public interface Convertible {
    default <A extends B, B> B CastUp(@NotNull A item) {
        return item;
    }

    default <A extends B, B> A CastDown(@NotNull B item) {
        return (A) item;
    }
}
