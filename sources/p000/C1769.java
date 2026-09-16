package p000;

import android.net.Uri;
import java.net.URL;

/* JADX INFO: renamed from: ۥٜٛؔۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1769 {

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC3534 f5897;

    /* JADX INFO: renamed from: ۥۣ */
    public final C5899 f5898;

    public C1769(C5899 c5899, InterfaceC3534 interfaceC3534) {
        this.f5898 = c5899;
        this.f5897 = interfaceC3534;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final URL m3561() {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        C5899 c5899 = this.f5898;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(c5899.f19451).appendPath("settings");
        C1045 c1045 = c5899.f19450;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", c1045.f3695).appendQueryParameter("display_version", c1045.f3697).build().toString());
    }
}
