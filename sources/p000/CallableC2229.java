package p000;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: ۥْۙؖؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC2229 implements Callable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f7386;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f7387 = 0;

    public /* synthetic */ CallableC2229(C3040 c3040) {
        this.f7386 = c3040;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f7387;
        Object obj = this.f7386;
        switch (i) {
            case 0:
                return new C2651(((C3040) obj).f10215);
            default:
                C5034 c5034 = ((BinderC5179) obj).f17131;
                c5034.m8494();
                C1518 c1518 = c5034.f16694;
                C5034.m8484(c1518);
                c1518.mo6517();
                throw new IllegalStateException("Unexpected call on client side");
        }
    }

    public CallableC2229(BinderC5179 binderC5179, C2679 c2679, String str) {
        this.f7386 = binderC5179;
    }
}
