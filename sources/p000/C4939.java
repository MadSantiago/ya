package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: ۦۗؑؕٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4939 implements InterfaceC3163 {

    /* JADX INFO: renamed from: ۥۣ */
    public final float f16359;

    public C4939(float f) {
        this.f16359 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4939) && this.f16359 == ((C4939) obj).f16359;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f16359)});
    }

    public final String toString() {
        return AbstractC3761.m6630((int) (this.f16359 * 100.0f), "%", new StringBuilder());
    }

    @Override // p000.InterfaceC3163
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo5840(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f16359;
    }
}
