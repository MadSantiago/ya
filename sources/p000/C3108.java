package p000;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦؒؓۥؘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3108 implements Iterable, Cloneable {

    /* JADX INFO: renamed from: ۥٓ */
    public static final String[] f10420 = new String[0];

    /* JADX INFO: renamed from: ۥْ */
    public String[] f10421;

    /* JADX INFO: renamed from: ۦ۟ */
    public String[] f10422;

    /* JADX INFO: renamed from: ۦۨ */
    public int f10423 = 0;

    public C3108() {
        String[] strArr = f10420;
        this.f10422 = strArr;
        this.f10421 = strArr;
    }

    public final Object clone() {
        try {
            C3108 c3108 = (C3108) super.clone();
            c3108.f10423 = this.f10423;
            String[] strArr = this.f10422;
            int i = this.f10423;
            String[] strArr2 = new String[i];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i));
            this.f10422 = strArr2;
            String[] strArr3 = this.f10421;
            int i2 = this.f10423;
            String[] strArr4 = new String[i2];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i2));
            this.f10421 = strArr4;
            return c3108;
        } catch (CloneNotSupportedException e) {
            C5028.m8450(e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3108.class != obj.getClass()) {
            return false;
        }
        C3108 c3108 = (C3108) obj;
        if (this.f10423 == c3108.f10423 && Arrays.equals(this.f10422, c3108.f10422)) {
            return Arrays.equals(this.f10421, c3108.f10421);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f10423 * 31) + Arrays.hashCode(this.f10422)) * 31) + Arrays.hashCode(this.f10421);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2692(this, 0);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final int m5688(String str) {
        if (str == null) {
            C1078.m2272("Object must not be null");
            return 0;
        }
        for (int i = 0; i < this.f10423; i++) {
            if (str.equals(this.f10422[i])) {
                return i;
            }
        }
        return -1;
    }
}
