package p000;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: ۥْؕٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0497 implements Map.Entry, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥْ */
    public final int f1791;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f1792;

    /* JADX INFO: renamed from: ۦۨ */
    public final C3598 f1793;

    public C0497(C3598 c3598, int i) {
        this.f1793 = c3598;
        this.f1792 = i;
        this.f1791 = c3598.f11976;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AbstractC3831.m6874(entry.getKey(), getKey()) && AbstractC3831.m6874(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        m1107();
        return this.f1793.f11978[this.f1792];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        m1107();
        return this.f1793.f11977[this.f1792];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        m1107();
        C3598 c3598 = this.f1793;
        c3598.m6404();
        Object[] objArr = c3598.f11977;
        if (objArr == null) {
            int length = c3598.f11978.length;
            if (length < 0) {
                C1078.m2272("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            c3598.f11977 = objArr;
        }
        int i = this.f1792;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m1107() {
        if (this.f1793.f11976 != this.f1791) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }
}
