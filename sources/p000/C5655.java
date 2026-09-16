package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ۦٌۤؔۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5655 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C0341 f18617;

    /* JADX INFO: renamed from: ۥُ */
    public final C0341 f18618;

    /* JADX INFO: renamed from: ۥّ */
    public final Serializable f18619;

    /* JADX INFO: renamed from: ۥۗ */
    public final C0341 f18620;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f18621;

    /* JADX INFO: renamed from: ۦؑ */
    public final C0341 f18622;

    /* JADX WARN: Multi-variable type inference failed */
    public C5655(C5655[] c5655Arr) {
        int i = 0;
        this.f18621 = 0;
        this.f18619 = c5655Arr;
        int length = c5655Arr.length;
        C0341[] c0341Arr = new C0341[length];
        for (int i2 = 0; i2 < length; i2++) {
            c0341Arr[i2] = ((C5655[]) this.f18619)[i2].m9485();
        }
        int i3 = 1;
        this.f18620 = new C0341(1, new C0139(c0341Arr, i));
        int length2 = ((C5655[]) this.f18619).length;
        C0341[] c0341Arr2 = new C0341[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            c0341Arr2[i4] = ((C5655[]) this.f18619)[i4].m9487();
        }
        this.f18617 = new C0341(0, new C4177(c0341Arr2, i));
        int length3 = ((C5655[]) this.f18619).length;
        C0341[] c0341Arr3 = new C0341[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            c0341Arr3[i5] = ((C5655[]) this.f18619)[i5].m9484();
        }
        this.f18622 = new C0341(1, new C0139(c0341Arr3, i3));
        int length4 = ((C5655[]) this.f18619).length;
        C0341[] c0341Arr4 = new C0341[length4];
        for (int i6 = 0; i6 < length4; i6++) {
            c0341Arr4[i6] = ((C5655[]) this.f18619)[i6].m9486();
        }
        this.f18618 = new C0341(0, new C4177(c0341Arr4, i3));
    }

    public final String toString() {
        int i = this.f18621;
        Object obj = this.f18619;
        switch (i) {
            case 0:
                return AbstractC0246.m522((C5655[]) obj, null, 57);
            default:
                return AbstractC5078.m8669(')', "RectRulers(", (String) obj);
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final C0341 m9484() {
        int i = this.f18621;
        return this.f18622;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C0341 m9485() {
        int i = this.f18621;
        return this.f18620;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C0341 m9486() {
        int i = this.f18621;
        return this.f18618;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final C0341 m9487() {
        int i = this.f18621;
        return this.f18617;
    }

    public C5655(String str) {
        this.f18621 = 1;
        this.f18619 = str;
        this.f18620 = new C0341(1, null);
        this.f18617 = new C0341(0, null);
        this.f18622 = new C0341(1, null);
        this.f18618 = new C0341(0, null);
    }
}
