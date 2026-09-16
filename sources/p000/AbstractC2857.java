package p000;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: ۥۧؓٔٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2857 extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: ۦۨ */
    public static final Object[] f9563 = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] objArrMo3022 = mo3022();
            if (objArrMo3022 != null) {
                return Arrays.copyOfRange(objArrMo3022, mo3024(), mo3023(), objArr.getClass());
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        mo1603(objArr);
        return objArr;
    }

    /* JADX INFO: renamed from: ۥُ */
    public Object[] mo3022() {
        return null;
    }

    /* JADX INFO: renamed from: ۥّ */
    public int mo3023() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public abstract AbstractC4822 mo4834();

    /* JADX INFO: renamed from: ۥۜ */
    public abstract boolean mo352();

    /* JADX INFO: renamed from: ۦؑ */
    public abstract int mo1603(Object[] objArr);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* JADX INFO: renamed from: ۦٛ, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC0219 iterator();

    /* JADX INFO: renamed from: ۦۙ */
    public int mo3024() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f9563);
    }
}
