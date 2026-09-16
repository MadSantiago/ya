package p000;

import android.util.FloatProperty;
import com.google.android.material.focus.FocusRingDrawable;

/* JADX INFO: renamed from: ۥًْؗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1235 extends FloatProperty {
    @Override // android.util.Property
    public final Float get(Object obj) {
        return Float.valueOf(((FocusRingDrawable) obj).f334);
    }

    @Override // android.util.FloatProperty
    public final void setValue(Object obj, float f) {
        FocusRingDrawable focusRingDrawable = (FocusRingDrawable) obj;
        focusRingDrawable.f334 = f;
        focusRingDrawable.invalidateSelf();
    }
}
