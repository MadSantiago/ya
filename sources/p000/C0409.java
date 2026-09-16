package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ۥؘؔؖٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0409 implements InterfaceC5349 {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f1494;

    public /* synthetic */ C0409(int i) {
        this.f1494 = i;
    }

    @Override // p000.InterfaceC5349
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC5288 mo920(Object obj, C1765 c1765) {
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        switch (this.f1494) {
            case 0:
                Uri uri = (Uri) obj;
                if (AbstractC0080.m7958(uri)) {
                    return new C4698(uri, c1765, i);
                }
                return null;
            case 1:
                return new C2794((Bitmap) obj, c1765, i);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return new C2794((ByteBuffer) obj, c1765, i2);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                Uri uri2 = (Uri) obj;
                if (AbstractC3831.m6874(uri2.getScheme(), "content")) {
                    return new C4698(uri2, c1765, i2);
                }
                return null;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return new C2794((Drawable) obj, c1765, i3);
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return new C0546((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (AbstractC3831.m6874(uri3.getScheme(), "android.resource")) {
                    return new C4698(uri3, c1765, i3);
                }
                return null;
        }
    }
}
