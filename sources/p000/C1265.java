package p000;

import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: ۥٓؓؗٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1265 extends AbstractC2797 {

    /* JADX INFO: renamed from: ۥُ */
    public final /* synthetic */ int f4334 = 2;

    /* JADX INFO: renamed from: ۥّ */
    public final /* synthetic */ C0127 f4335;

    /* JADX INFO: renamed from: ۦۙ */
    public final /* synthetic */ int f4336;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1265(String str, C0127 c0127, int i, int i2) {
        super(str, true);
        this.f4335 = c0127;
        this.f4336 = i;
    }

    @Override // p000.AbstractC2797
    /* JADX INFO: renamed from: ۥۣ */
    public final long mo583() {
        switch (this.f4334) {
            case 0:
                this.f4335.f516.getClass();
                try {
                    this.f4335.f524.m5835(this.f4336, 9);
                    synchronized (this.f4335) {
                        this.f4335.f508.remove(Integer.valueOf(this.f4336));
                    }
                } catch (IOException unused) {
                }
                return -1L;
            case 1:
                this.f4335.f516.getClass();
                try {
                    this.f4335.f524.m5835(this.f4336, 9);
                    synchronized (this.f4335) {
                        this.f4335.f508.remove(Integer.valueOf(this.f4336));
                    }
                } catch (IOException unused2) {
                }
                return -1L;
            default:
                this.f4335.f516.getClass();
                synchronized (this.f4335) {
                    this.f4335.f508.remove(Integer.valueOf(this.f4336));
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1265(String str, C0127 c0127, int i, List list) {
        super(str, true);
        this.f4335 = c0127;
        this.f4336 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1265(String str, C0127 c0127, int i, List list, boolean z) {
        super(str, true);
        this.f4335 = c0127;
        this.f4336 = i;
    }
}
