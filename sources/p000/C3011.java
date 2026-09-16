package p000;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: ۦؚؐ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3011 implements InterfaceC2979 {

    /* JADX INFO: renamed from: ۥۗ */
    public final Object f10145;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f10146;

    public /* synthetic */ C3011(int i, Object obj) {
        this.f10146 = i;
        this.f10145 = obj;
    }

    public final String toString() {
        int i = this.f10146;
        Object obj = this.f10145;
        switch (i) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((InterfaceC4745) obj).getClass().getSimpleName() + '@' + AbstractC4489.m7777(this) + ']';
            default:
                return "DisposeOnCancel[" + ((InterfaceC4883) obj) + ']';
        }
    }
}
