package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۥٍؖؔۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0967 implements InterfaceC3979 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final List f3416;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f3417;

    /* JADX INFO: renamed from: ۥْ */
    public Float f3413 = null;

    /* JADX INFO: renamed from: ۥٓ */
    public Float f3414 = null;

    /* JADX INFO: renamed from: ۥَ */
    public C4323 f3412 = null;

    /* JADX INFO: renamed from: ۥٖ */
    public C4323 f3415 = null;

    public C0967(int i, ArrayList arrayList) {
        this.f3417 = i;
        this.f3416 = arrayList;
    }

    @Override // p000.InterfaceC3979
    /* JADX INFO: renamed from: ۥؓ */
    public final boolean mo1315() {
        return this.f3416.contains(this);
    }
}
