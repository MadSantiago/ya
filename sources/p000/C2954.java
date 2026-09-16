package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥُٕۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2954 extends C0532 implements InterfaceC5698 {

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C4718 f9910;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2954(C4718 c4718, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f9910 = c4718;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC2101.m4078(this, getContentDescription());
        setOnTouchListener(new C3825(this, this));
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f9910.m8053();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }

    @Override // p000.InterfaceC5698
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo0() {
        return false;
    }

    @Override // p000.InterfaceC5698
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo1() {
        return false;
    }
}
