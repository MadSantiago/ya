package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: ۦٕؕۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4247 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ AbstractActivityC1500 f14075;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f14076;

    public /* synthetic */ C4247(AbstractActivityC1500 abstractActivityC1500, int i) {
        this.f14076 = i;
        this.f14075 = abstractActivityC1500;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f14076;
        int i2 = 0;
        AbstractActivityC1500 abstractActivityC1500 = this.f14075;
        switch (i) {
            case 0:
                abstractActivityC1500.reportFullyDrawn();
                return C2358.f7817;
            case 1:
                return new C1300(new C4247(abstractActivityC1500, i2));
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C4429 c4429 = new C4429();
                abstractActivityC1500.m3179().m7196().f13504.m3125(c4429);
                return c4429;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return new C3022(abstractActivityC1500.getApplication(), abstractActivityC1500, abstractActivityC1500.getIntent() != null ? abstractActivityC1500.getIntent().getExtras() : null);
            default:
                C4023 c4023 = new C4023(new RunnableC3697(abstractActivityC1500, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (AbstractC3831.m6874(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC1500.f5665.mo2388(new C1653(c4023, abstractActivityC1500));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new RunnableC5689(3, abstractActivityC1500, c4023));
                    }
                }
                return c4023;
        }
    }
}
