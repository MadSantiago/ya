package p000;

import android.webkit.MimeTypeMap;
import java.io.File;

/* JADX INFO: renamed from: ۥؙؖؖؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0546 implements InterfaceC5288 {

    /* JADX INFO: renamed from: ۥۣ */
    public final File f1965;

    public C0546(File file) {
        this.f1965 = file;
    }

    @Override // p000.InterfaceC5288
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo580(InterfaceC0443 interfaceC0443) {
        String str = C5051.f16766;
        File file = this.f1965;
        return new C2089(new C4798(C4992.m8379(file), AbstractC1567.f5283, null, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(AbstractC0684.m1535('.', file.getName(), "")), 3);
    }
}
