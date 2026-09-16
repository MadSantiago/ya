package p000;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;

/* JADX INFO: renamed from: ۦٔؗٗ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4198 implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ C5662 f13953;

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ C0983 f13954;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ C5450 f13955;

    public C4198(C5450 c5450, C0983 c0983, C5662 c5662) {
        this.f13955 = c5450;
        this.f13954 = c0983;
        this.f13953 = c5662;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        this.f13955.f17965 = imageDecoder;
        Size size = imageInfo.getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        C0983 c0983 = this.f13954;
        C1765 c1765 = c0983.f3476;
        C0181 c0181 = c1765.f5882;
        int i = c1765.f5877;
        C0181 c0182 = C0181.f668;
        int iM4813 = AbstractC3831.m6874(c0181, c0182) ? width : AbstractC2552.m4813(c0181.f670, i);
        C1765 c1766 = c0983.f3476;
        C0181 c0183 = c1766.f5882;
        int iM4814 = AbstractC3831.m6874(c0183, c0182) ? height : AbstractC2552.m4813(c0183.f669, c1766.f5877);
        if (width > 0 && height > 0 && (width != iM4813 || height != iM4814)) {
            double dM5783 = C3133.m5783(width, height, iM4813, iM4814, c0983.f3476.f5877);
            boolean z = dM5783 < 1.0d;
            this.f13953.f18631 = z;
            if (z || !c0983.f3476.f5878) {
                imageDecoder.setTargetSize(AbstractC2776.m5229(((double) width) * dM5783), AbstractC2776.m5229(dM5783 * ((double) height)));
            }
        }
        C1765 c1767 = c0983.f3476;
        imageDecoder.setAllocator(c1767.f5879 == Bitmap.Config.HARDWARE ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!c1767.f5888 ? 1 : 0);
        ColorSpace colorSpace = c1767.f5876;
        if (colorSpace != null) {
            imageDecoder.setTargetColorSpace(colorSpace);
        }
        imageDecoder.setUnpremultipliedRequired(!c1767.f5880);
        if (c1767.f5883.f17489.get("coil#animated_transformation") == null) {
            imageDecoder.setPostProcessor(null);
        } else {
            C0178.m382();
        }
    }
}
