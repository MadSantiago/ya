package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦۛ۠ٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5257 extends View {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C1909 f17338;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ ViewGroup f17339;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5257(C1909 c1909, Context context, ViewGroup viewGroup) {
        super(context);
        this.f17338 = c1909;
        this.f17339 = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        C1909 c1909 = this.f17338;
        ArrayList arrayList = c1909.f6298;
        Drawable background = this.f17339.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (c1909.f6297 != color) {
            c1909.f6297 = color;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C2075) arrayList.get(size)).m4020(color);
            }
        }
    }
}
