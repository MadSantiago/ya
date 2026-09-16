package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: ۦِۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3995 implements InterfaceC3163 {

    /* JADX INFO: renamed from: ۥۣ */
    public final float f13327;

    public C3995(float f) {
        this.f13327 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3995) && this.f13327 == ((C3995) obj).f13327;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f13327)});
    }

    @Override // p000.InterfaceC3163
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo5840(RectF rectF) {
        float fMin = Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
        float f = this.f13327;
        if (f < 0.0f) {
            return 0.0f;
        }
        return f > fMin ? fMin : f;
    }
}
