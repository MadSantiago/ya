package p000;

import java.util.HashMap;

/* JADX INFO: renamed from: ۦٜ۠ؖٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5409 extends C4418 {

    /* JADX INFO: renamed from: ۥَ */
    public final HashMap f17862 = new HashMap();

    @Override // p000.C4418
    /* JADX INFO: renamed from: ۥۗ */
    public final C2985 mo7717(Object obj) {
        return (C2985) this.f17862.get(obj);
    }

    @Override // p000.C4418
    /* JADX INFO: renamed from: ۦؑ */
    public final Object mo7718(Object obj) {
        Object objMo7718 = super.mo7718(obj);
        this.f17862.remove(obj);
        return objMo7718;
    }
}
