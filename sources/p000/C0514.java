package p000;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: ۥؖؒؒؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0514 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ XC_MethodHook.MethodHookParam f1837;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f1838;

    public /* synthetic */ C0514(XC_MethodHook.MethodHookParam methodHookParam, int i) {
        this.f1838 = i;
        this.f1837 = methodHookParam;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f1838;
        XC_MethodHook.MethodHookParam methodHookParam = this.f1837;
        switch (i) {
            case 0:
                return methodHookParam.method;
            case 1:
                return methodHookParam.thisObject;
            default:
                return methodHookParam.args;
        }
    }
}
