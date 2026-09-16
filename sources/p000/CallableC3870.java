package p000;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: ۦَِؗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC3870 implements Callable {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ BinderC5179 f12916;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ String f12917;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ String f12918;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ String f12919;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f12920;

    public /* synthetic */ CallableC3870(BinderC5179 binderC5179, String str, String str2, String str3, int i) {
        this.f12920 = i;
        this.f12919 = str;
        this.f12917 = str2;
        this.f12918 = str3;
        this.f12916 = binderC5179;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f12920;
        String str = this.f12918;
        String str2 = this.f12917;
        String str3 = this.f12919;
        BinderC5179 binderC5179 = this.f12916;
        switch (i) {
            case 0:
                C5034 c5034 = binderC5179.f17131;
                c5034.m8494();
                C1159 c1159 = c5034.f16670;
                C5034.m8484(c1159);
                return c1159.m2432(str3, str2, str);
            case 1:
                C5034 c5035 = binderC5179.f17131;
                c5035.m8494();
                C1159 c11510 = c5035.f16670;
                C5034.m8484(c11510);
                return c11510.m2432(str3, str2, str);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C5034 c5036 = binderC5179.f17131;
                c5036.m8494();
                C1159 c11511 = c5036.f16670;
                C5034.m8484(c11511);
                return c11511.m2424(str3, str2, str);
            default:
                C5034 c5037 = binderC5179.f17131;
                c5037.m8494();
                C1159 c11512 = c5037.f16670;
                C5034.m8484(c11512);
                return c11512.m2424(str3, str2, str);
        }
    }
}
