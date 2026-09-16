package p000;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;

/* JADX INFO: renamed from: ۥّٟؒٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1148 extends AbstractC1127 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Context f4002;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f4003;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1148(Context context, int i) {
        super(0);
        this.f4003 = i;
        this.f4002 = context;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f4003;
        Context context = this.f4002;
        switch (i) {
            case 0:
                Bitmap.Config config = AbstractC0080.f15150;
                File cacheDir = context.getCacheDir();
                if (cacheDir != null) {
                    cacheDir.mkdirs();
                    return cacheDir;
                }
                C1078.m2276("cacheDir == null");
                return null;
            default:
                Bitmap.Config config2 = AbstractC0080.f15150;
                File cacheDir2 = context.getCacheDir();
                if (cacheDir2 != null) {
                    cacheDir2.mkdirs();
                    return cacheDir2;
                }
                C1078.m2276("cacheDir == null");
                return null;
        }
    }
}
