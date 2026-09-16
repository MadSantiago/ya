package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: ۦًٞؓۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4792 implements InterfaceC3163 {

    /* JADX INFO: renamed from: ۥۗ */
    public final float f15803;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC3163 f15804;

    public C4792(float f, InterfaceC3163 interfaceC3163) {
        while (interfaceC3163 instanceof C4792) {
            interfaceC3163 = ((C4792) interfaceC3163).f15804;
            f += ((C4792) interfaceC3163).f15803;
        }
        this.f15804 = interfaceC3163;
        this.f15803 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4792)) {
            return false;
        }
        C4792 c4792 = (C4792) obj;
        return this.f15804.equals(c4792.f15804) && this.f15803 == c4792.f15803;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15804, Float.valueOf(this.f15803)});
    }

    @Override // p000.InterfaceC3163
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo5840(RectF rectF) {
        return Math.max(0.0f, this.f15804.mo5840(rectF) + this.f15803);
    }
}
