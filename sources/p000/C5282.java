package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦٌۜؔۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5282 extends ArrayAdapter {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ C5615 f17407;

    /* JADX INFO: renamed from: ۥۗ */
    public ColorStateList f17408;

    /* JADX INFO: renamed from: ۥۣ */
    public ColorStateList f17409;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5282(C5615 c5615, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f17407 = c5615;
        m8917();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        FocusRingDrawable focusRingDrawable;
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            C5615 c5615 = this.f17407;
            Drawable drawable = null;
            FocusRingDrawable focusRingDrawable2 = null;
            drawable = null;
            if (c5615.getText().toString().contentEquals(textView.getText()) && c5615.f18502 != 0) {
                Drawable colorDrawable = new ColorDrawable(c5615.f18502);
                if (this.f17408 != null) {
                    colorDrawable.setTintList(this.f17409);
                    RippleDrawable rippleDrawable = new RippleDrawable(this.f17408, colorDrawable, null);
                    Context context = getContext();
                    ColorDrawable colorDrawable2 = FocusRingDrawable.f326;
                    if (AbstractC2776.m5219(context.getTheme(), R.attr.focusRingsEnabled, false)) {
                        focusRingDrawable = new FocusRingDrawable(context, FocusRingDrawable.f326);
                        rippleDrawable.addLayer(focusRingDrawable);
                        focusRingDrawable.setCallback(rippleDrawable);
                    }
                    if (focusRingDrawable2 != null) {
                        focusRingDrawable2 = focusRingDrawable;
                        focusRingDrawable2.f329.f4173 = c5615.f18505;
                    }
                    focusRingDrawable2 = focusRingDrawable;
                    drawable = rippleDrawable;
                } else {
                    drawable = colorDrawable;
                }
            }
            textView.setBackground(drawable);
        }
        return view2;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m8917() {
        ColorStateList colorStateList;
        C5615 c5615 = this.f17407;
        ColorStateList colorStateList2 = c5615.f18499;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {android.R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f17408 = colorStateList;
        if (c5615.f18502 != 0 && c5615.f18499 != null) {
            int[] iArr2 = {android.R.attr.state_hovered, -16842919};
            int[] iArr3 = {android.R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC1373.m2910(c5615.f18499.getColorForState(iArr3, 0), c5615.f18502), AbstractC1373.m2910(c5615.f18499.getColorForState(iArr2, 0), c5615.f18502), c5615.f18502});
        }
        this.f17409 = colorStateList3;
    }
}
