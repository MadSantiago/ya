package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۥِٜؑٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C1803 implements Iterable, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥْ */
    public final int f6004;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f6005;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f6006;

    public C1803(int i, int i2, int i3) {
        if (i3 == 0) {
            C1078.m2272("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            C1078.m2272("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f6006 = i;
        this.f6005 = C5063.m8638(i, i2, i3);
        this.f6004 = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1803)) {
            return false;
        }
        if (isEmpty() && ((C1803) obj).isEmpty()) {
            return true;
        }
        C1803 c1803 = (C1803) obj;
        return this.f6006 == c1803.f6006 && this.f6005 == c1803.f6005 && this.f6004 == c1803.f6004;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f6006 * 31) + this.f6005) * 31) + this.f6004;
    }

    public boolean isEmpty() {
        int i = this.f6005;
        int i2 = this.f6004;
        int i3 = this.f6006;
        if (i2 > 0) {
            return i3 > i;
        }
        return i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0274(this.f6006, this.f6005, this.f6004);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f6005;
        int i2 = this.f6004;
        int i3 = this.f6006;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
