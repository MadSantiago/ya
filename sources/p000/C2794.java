package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ۥۦٌْؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2794 implements InterfaceC5288 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Object f9345;

    /* JADX INFO: renamed from: ۥۗ */
    public final C1765 f9346;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f9347;

    public /* synthetic */ C2794(Object obj, C1765 c1765, int i) {
        this.f9347 = i;
        this.f9345 = obj;
        this.f9346 = c1765;
    }

    @Override // p000.InterfaceC5288
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo580(InterfaceC0443 interfaceC0443) {
        int i = this.f9347;
        Object obj = this.f9345;
        C1765 c1765 = this.f9346;
        int i2 = 0;
        switch (i) {
            case 0:
                return new C0960(new BitmapDrawable(c1765.f5881.getResources(), (Bitmap) obj), false, 2);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    C1270 c1270 = new C1270();
                    c1270.write(byteBuffer);
                    return new C2089(new C2400(c1270, new C1148(c1765.f5881, 0), null), null, 2);
                } finally {
                    byteBuffer.position(0);
                }
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config config = AbstractC0080.f15150;
                boolean z = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof C3603);
                if (z) {
                    bitmapDrawable = new BitmapDrawable(c1765.f5881.getResources(), AbstractC1605.m3347(bitmapDrawable, c1765.f5879, c1765.f5882, c1765.f5877, c1765.f5878));
                }
                return new C0960(bitmapDrawable, z, 2);
        }
    }
}
