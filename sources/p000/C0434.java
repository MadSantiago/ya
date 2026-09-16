package p000;

import ru.bluecat.yandexmapspatcher.p003ui.MainActivity;

/* JADX INFO: renamed from: ۥّؕؑٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0434 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ MainActivity f1592;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f1593;

    public /* synthetic */ C0434(MainActivity mainActivity, int i) {
        this.f1593 = i;
        this.f1592 = mainActivity;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f1593;
        MainActivity mainActivity = this.f1592;
        switch (i) {
            case 0:
                return AbstractC1631.m3411(mainActivity).m4427(AbstractC5041.m8557(C2197.class), null, null);
            case 1:
                return AbstractC1631.m3411(mainActivity).m4427(AbstractC5041.m8557(C3998.class), null, null);
            default:
                return C5063.m8631(AbstractC5041.m8557(C5081.class), mainActivity.mo651(), mainActivity.mo640(), AbstractC1631.m3411(mainActivity));
        }
    }
}
