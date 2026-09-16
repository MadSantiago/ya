package p000;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.List;

/* JADX INFO: renamed from: ۦؔۜؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3249 extends C2592 {
    @Override // p000.C0157, p000.C2559
    /* JADX INFO: renamed from: ۥۗ */
    public void mo338(C3566 c3566, C3566 c3567, Window window, View view, boolean z, boolean z2) {
        AbstractC5378.m9058(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        int iM6361 = c3566.m6361(z);
        int iM6362 = c3567.m6361(z2);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    if (iM6361 != 0 || iM6362 != 0) {
                        List listM4188 = AbstractC2164.m4188(new C3931(2, iM6361), new C3931(1, iM6362), new C3931(4, iM6362), new C3931(8, iM6362));
                        C2648 c2648 = new C2648(((ViewGroup) view).getContext(), listM4188);
                        c2648.setTag(listM4188);
                        viewGroup.addView(c2648);
                        break;
                    }
                    break;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                Object tag = childAt.getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof C3931)) {
                        for (Object obj : (Iterable) tag) {
                            if ((obj instanceof C3931 ? (C3931) obj : null) != null) {
                                C3931 c3931 = (C3931) obj;
                                int i3 = c3931.f13119;
                                C3264 c3264 = c3931.f13117;
                                ColorDrawable colorDrawable = c3931.f13116;
                                if (i3 == 1) {
                                    c3931.f13121 = true;
                                    if (c3931.f13118 != iM6362) {
                                        c3931.f13118 = iM6362;
                                        colorDrawable.setColor(iM6362);
                                        c3264.f10953 = colorDrawable;
                                        C3369 c3369 = c3264.f10959;
                                        if (c3369 != null) {
                                            ((View) c3369.f11254).setBackground(colorDrawable);
                                        }
                                    }
                                } else if (i3 == 2) {
                                    c3931.f13121 = true;
                                    if (c3931.f13118 != iM6361) {
                                        c3931.f13118 = iM6361;
                                        colorDrawable.setColor(iM6361);
                                        c3264.f10953 = colorDrawable;
                                        C3369 c33610 = c3264.f10959;
                                        if (c33610 != null) {
                                            ((View) c33610.f11254).setBackground(colorDrawable);
                                        }
                                    }
                                } else if (i3 == 4) {
                                    c3931.f13121 = true;
                                    if (c3931.f13118 != iM6362) {
                                        c3931.f13118 = iM6362;
                                        colorDrawable.setColor(iM6362);
                                        c3264.f10953 = colorDrawable;
                                        C3369 c33611 = c3264.f10959;
                                        if (c33611 != null) {
                                            ((View) c33611.f11254).setBackground(colorDrawable);
                                        }
                                    }
                                } else if (i3 == 8) {
                                    c3931.f13121 = true;
                                    if (c3931.f13118 != iM6362) {
                                        c3931.f13118 = iM6362;
                                        colorDrawable.setColor(iM6362);
                                        c3264.f10953 = colorDrawable;
                                        C3369 c33612 = c3264.f10959;
                                        if (c33612 != null) {
                                            ((View) c33612.f11254).setBackground(colorDrawable);
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    }
                }
                i = i2;
            }
        }
        window.setNavigationBarContrastEnforced(c3567.f11806 == 0);
        int i4 = Build.VERSION.SDK_INT;
        AbstractC0186 c1554 = i4 >= 35 ? new C1554(window) : i4 >= 30 ? new C4764(window) : new C3326(window);
        c1554.mo448(!z);
        c1554.mo447(!z2);
    }
}
