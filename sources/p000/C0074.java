package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: ۦٕ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0074 implements InterfaceC3163 {

    /* JADX INFO: renamed from: ۥۣ */
    public final float f13964;

    public C0074(float f) {
        this.f13964 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0074) && this.f13964 == ((C0074) obj).f13964;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f13964)});
    }

    public final String toString() {
        return this.f13964 + "px";
    }

    @Override // p000.InterfaceC3163
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo5840(RectF rectF) {
        return this.f13964;
    }
}
