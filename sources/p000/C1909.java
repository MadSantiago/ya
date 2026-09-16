package p000;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ۥؙٝؗؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1909 {

    /* JADX INFO: renamed from: ۥؗ */
    public C5364 f6296;

    /* JADX INFO: renamed from: ۥُ */
    public int f6297;

    /* JADX INFO: renamed from: ۥۗ */
    public final ArrayList f6298 = new ArrayList();

    /* JADX INFO: renamed from: ۥۣ */
    public final C5257 f6299;

    /* JADX INFO: renamed from: ۦؑ */
    public C5364 f6300;

    public C1909(ViewGroup viewGroup) {
        View childAt;
        C5364 c5364 = C5364.f17692;
        this.f6296 = c5364;
        this.f6300 = c5364;
        Drawable background = viewGroup.getBackground();
        int i = 0;
        this.f6297 = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        C5257 c5257 = new C5257(this, viewGroup.getContext(), viewGroup);
        this.f6299 = c5257;
        c5257.setVisibility(8);
        c5257.setWillNotDraw(true);
        C5322 c5322 = new C5322(10, this);
        WeakHashMap weakHashMap = AbstractC3608.f12013;
        AbstractC5039.m8554(c5257, c5322);
        C0460.m977(c5257, new C2705(this));
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(childCount);
            if (childAt.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                break;
            } else {
                childCount--;
            }
        }
        if (childAt == null) {
            viewGroup.addView(c5257, 0);
        } else {
            childAt.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3112(viewGroup, c5257, i));
        }
    }
}
