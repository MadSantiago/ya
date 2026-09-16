package p000;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: ۥؙؒؔٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC0256 implements Callable {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f957;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final /* synthetic */ CallableC0256 f956 = new CallableC0256(0);

    /* JADX INFO: renamed from: ۥْ */
    public static final /* synthetic */ CallableC0256 f955 = new CallableC0256(1);

    public /* synthetic */ CallableC0256(int i) {
        this.f957 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f957) {
            case 0:
                C2825 c2825 = new C2825(4, "internal.platform");
                c2825.f3771.put("getVersion", new C2825(3, "getVersion"));
                return c2825;
            default:
                return null;
        }
    }
}
