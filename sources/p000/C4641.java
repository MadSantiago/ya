package p000;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* JADX INFO: renamed from: ۦٛؗؔٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4641 extends RippleDrawable {

    /* JADX INFO: renamed from: ۥْ */
    public boolean f15314;

    /* JADX INFO: renamed from: ۦ۟ */
    public C1327 f15315;

    /* JADX INFO: renamed from: ۦۨ */
    public final boolean f15316;

    public C4641(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.f15316 = z;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f15316) {
            this.f15314 = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f15314 = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f15314;
    }
}
