package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۥٍؓؔۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0944 implements InterfaceC4770 {

    /* JADX INFO: renamed from: ۥۗ */
    public final float[] f3343;

    /* JADX INFO: renamed from: ۥۣ */
    public final float[] f3344;

    public C0944(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            C1078.m2272("Array lengths must match and be nonzero");
            throw null;
        }
        this.f3344 = fArr;
        this.f3343 = fArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0944)) {
            return false;
        }
        C0944 c0944 = (C0944) obj;
        return Arrays.equals(this.f3344, c0944.f3344) && Arrays.equals(this.f3343, c0944.f3343);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3343) + (Arrays.hashCode(this.f3344) * 31);
    }

    public final String toString() {
        return "FontScaleConverter{fromSpValues=" + Arrays.toString(this.f3344) + ", toDpValues=" + Arrays.toString(this.f3343) + '}';
    }

    @Override // p000.InterfaceC4770
    /* JADX INFO: renamed from: ۥۗ */
    public final float mo1918(float f) {
        return AbstractC0487.m1059(f, this.f3344, this.f3343);
    }

    @Override // p000.InterfaceC4770
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo1919(float f) {
        return AbstractC0487.m1059(f, this.f3343, this.f3344);
    }
}
