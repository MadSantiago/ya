package p000;

import android.view.View;

/* JADX INFO: renamed from: ۥُۣؗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1069 extends AbstractC2776 {

    /* JADX INFO: renamed from: ۥۜ */
    public final /* synthetic */ int f3751;

    public /* synthetic */ C1069(int i) {
        this.f3751 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC2776
    /* JADX INFO: renamed from: ۥؖ */
    public final float mo2267(C3472 c3472) {
        switch (this.f3751) {
            case 0:
                return ((View) c3472).getAlpha();
            case 1:
                return ((View) c3472).getScaleX();
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return ((View) c3472).getScaleY();
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return ((View) c3472).getRotation();
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return ((View) c3472).getRotationX();
            default:
                return ((View) c3472).getRotationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC2776
    /* JADX INFO: renamed from: ۥ۟ */
    public final void mo2268(C3472 c3472, float f) {
        switch (this.f3751) {
            case 0:
                ((View) c3472).setAlpha(f);
                break;
            case 1:
                ((View) c3472).setScaleX(f);
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ((View) c3472).setScaleY(f);
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                ((View) c3472).setRotation(f);
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                ((View) c3472).setRotationX(f);
                break;
            default:
                ((View) c3472).setRotationY(f);
                break;
        }
    }
}
