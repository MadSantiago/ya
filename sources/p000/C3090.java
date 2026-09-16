package p000;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: ۦٟؒؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3090 implements InterfaceC5264, InterfaceC2697 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ C5034 f10371;

    public /* synthetic */ C3090(C5034 c5034) {
        this.f10371 = c5034;
    }

    @Override // p000.InterfaceC5264
    /* JADX INFO: renamed from: ۥۗ */
    public void mo4475(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C5034 c5034 = this.f10371;
        if (!zIsEmpty) {
            c5034.mo2406().m6515(new RunnableC1948(this, str, str2, bundle, 12));
            return;
        }
        C5371 c5371 = c5034.f16665;
        if (c5371 != null) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12020.m9430(str2, "AppId not known when logging event");
        }
    }

    @Override // p000.InterfaceC2697
    /* JADX INFO: renamed from: ۥۣ */
    public /* synthetic */ void mo5024(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.f10371.m8515(str, i, th, bArr, map);
    }
}
