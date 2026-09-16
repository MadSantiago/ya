package p000;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ۦْؔۜؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4075 implements InterfaceC0560 {

    /* JADX INFO: renamed from: ۥؗ */
    public ActionBarOverlayLayout f13568;

    /* JADX INFO: renamed from: ۥَ */
    public C4799 f13569;

    /* JADX INFO: renamed from: ۥُ */
    public InterfaceC4870 f13570;

    /* JADX INFO: renamed from: ۥّ */
    public ActionBarContextView f13571;

    /* JADX INFO: renamed from: ۥْ */
    public boolean f13572;

    /* JADX INFO: renamed from: ۥٓ */
    public boolean f13573;

    /* JADX INFO: renamed from: ۥٖ */
    public boolean f13574;

    /* JADX INFO: renamed from: ۥۖ */
    public final C0250 f13575;

    /* JADX INFO: renamed from: ۥۗ */
    public Context f13576;

    /* JADX INFO: renamed from: ۥۜ */
    public boolean f13577;

    /* JADX INFO: renamed from: ۥۣ */
    public Context f13578;

    /* JADX INFO: renamed from: ۦؑ */
    public ActionBarContainer f13579;

    /* JADX INFO: renamed from: ۦؚ */
    public boolean f13580;

    /* JADX INFO: renamed from: ۦٌ */
    public final ArrayList f13581;

    /* JADX INFO: renamed from: ۦِ */
    public C3795 f13582;

    /* JADX INFO: renamed from: ۦٕ */
    public final C1039 f13583;

    /* JADX INFO: renamed from: ۦٗ */
    public boolean f13584;

    /* JADX INFO: renamed from: ۦٛ */
    public C3795 f13585;

    /* JADX INFO: renamed from: ۦۗ */
    public C5002 f13586;

    /* JADX INFO: renamed from: ۦۙ */
    public final View f13587;

    /* JADX INFO: renamed from: ۦۚ */
    public int f13588;

    /* JADX INFO: renamed from: ۦۛ */
    public final C0250 f13589;

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean f13590;

    /* JADX INFO: renamed from: ۦۨ */
    public boolean f13591;

    /* JADX INFO: renamed from: ۥٙ */
    public static final AccelerateInterpolator f13567 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: ۥؖ */
    public static final DecelerateInterpolator f13566 = new DecelerateInterpolator();

    public C4075(Activity activity, boolean z) {
        new ArrayList();
        this.f13581 = new ArrayList();
        this.f13588 = 0;
        this.f13591 = true;
        this.f13573 = true;
        this.f13589 = new C0250(this, 0);
        this.f13575 = new C0250(this, 1);
        this.f13583 = new C1039(20, this);
        View decorView = activity.getWindow().getDecorView();
        m7258(decorView);
        if (z) {
            return;
        }
        this.f13587 = decorView.findViewById(R.id.content);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m7258(View view) {
        InterfaceC4870 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(ru.bluecat.yandexmapspatcher.R.id.decor_content_parent);
        this.f13568 = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(ru.bluecat.yandexmapspatcher.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC4870) {
            wrapper = (InterfaceC4870) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f13570 = wrapper;
        this.f13571 = (ActionBarContextView) view.findViewById(ru.bluecat.yandexmapspatcher.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(ru.bluecat.yandexmapspatcher.R.id.action_bar_container);
        this.f13579 = actionBarContainer;
        InterfaceC4870 interfaceC4870 = this.f13570;
        if (interfaceC4870 == null || this.f13571 == null || actionBarContainer == null) {
            C1078.m2276(C4075.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((C0251) interfaceC4870).f930.getContext();
        this.f13578 = context;
        if ((((C0251) this.f13570).f928 & 4) != 0) {
            this.f13577 = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f13570.getClass();
        m7259(context.getResources().getBoolean(ru.bluecat.yandexmapspatcher.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f13578.obtainStyledAttributes(null, AbstractC5618.f18520, ru.bluecat.yandexmapspatcher.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f13568;
            if (!actionBarOverlayLayout2.f85) {
                C1078.m2276("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.f13584 = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f13579;
            WeakHashMap weakHashMap = AbstractC3608.f12013;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m7259(boolean z) {
        if (z) {
            this.f13579.setTabContainer(null);
            ((C0251) this.f13570).getClass();
        } else {
            ((C0251) this.f13570).getClass();
            this.f13579.setTabContainer(null);
        }
        this.f13570.getClass();
        ((C0251) this.f13570).f930.setCollapsible(false);
        this.f13568.setHasNonEmbeddedTabs(false);
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m7260(boolean z) {
        boolean z2 = this.f13572 || !this.f13590;
        boolean z3 = this.f13573;
        final C1039 c1039 = this.f13583;
        View view = this.f13587;
        if (!z2) {
            if (z3) {
                this.f13573 = false;
                C4799 c4799 = this.f13569;
                if (c4799 != null) {
                    c4799.m8177();
                }
                int i = this.f13588;
                C0250 c0250 = this.f13589;
                if (i != 0 || (!this.f13574 && !z)) {
                    c0250.mo526();
                    return;
                }
                this.f13579.setAlpha(1.0f);
                this.f13579.setTransitioning(true);
                C4799 c47910 = new C4799();
                float f = -this.f13579.getHeight();
                if (z) {
                    int[] iArr = {0, 0};
                    this.f13579.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                C1551 c1551M6432 = AbstractC3608.m6432(this.f13579);
                c1551M6432.m3298(f);
                final View view2 = (View) c1551M6432.f5238.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c1039 != null ? new ValueAnimator.AnimatorUpdateListener(view2) { // from class: ۥۢؖۙؔ
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((C4075) this.f8739.f3672).f13579.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z4 = c47910.f15831;
                ArrayList arrayList = c47910.f15834;
                if (!z4) {
                    arrayList.add(c1551M6432);
                }
                if (this.f13591 && view != null) {
                    C1551 c1551M6433 = AbstractC3608.m6432(view);
                    c1551M6433.m3298(f);
                    if (!c47910.f15831) {
                        arrayList.add(c1551M6433);
                    }
                }
                boolean z5 = c47910.f15831;
                if (!z5) {
                    c47910.f15830 = f13567;
                }
                if (!z5) {
                    c47910.f15833 = 250L;
                }
                if (!z5) {
                    c47910.f15835 = c0250;
                }
                this.f13569 = c47910;
                c47910.m8176();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.f13573 = true;
        C4799 c47911 = this.f13569;
        if (c47911 != null) {
            c47911.m8177();
        }
        this.f13579.setVisibility(0);
        int i2 = this.f13588;
        C0250 c0251 = this.f13575;
        if (i2 == 0 && (this.f13574 || z)) {
            this.f13579.setTranslationY(0.0f);
            float f2 = -this.f13579.getHeight();
            if (z) {
                int[] iArr2 = {0, 0};
                this.f13579.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.f13579.setTranslationY(f2);
            C4799 c47912 = new C4799();
            C1551 c1551M6434 = AbstractC3608.m6432(this.f13579);
            c1551M6434.m3298(0.0f);
            final View view3 = (View) c1551M6434.f5238.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c1039 != null ? new ValueAnimator.AnimatorUpdateListener(view3) { // from class: ۥۢؖۙؔ
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((C4075) this.f8739.f3672).f13579.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z6 = c47912.f15831;
            ArrayList arrayList2 = c47912.f15834;
            if (!z6) {
                arrayList2.add(c1551M6434);
            }
            if (this.f13591 && view != null) {
                view.setTranslationY(f2);
                C1551 c1551M6435 = AbstractC3608.m6432(view);
                c1551M6435.m3298(0.0f);
                if (!c47912.f15831) {
                    arrayList2.add(c1551M6435);
                }
            }
            boolean z7 = c47912.f15831;
            if (!z7) {
                c47912.f15830 = f13566;
            }
            if (!z7) {
                c47912.f15833 = 250L;
            }
            if (!z7) {
                c47912.f15835 = c0251;
            }
            this.f13569 = c47912;
            c47912.m8176();
        } else {
            this.f13579.setAlpha(1.0f);
            this.f13579.setTranslationY(0.0f);
            if (this.f13591 && view != null) {
                view.setTranslationY(0.0f);
            }
            c0251.mo526();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f13568;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = AbstractC3608.f12013;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final Context m7261() {
        Context context = this.f13576;
        if (context != null) {
            return context;
        }
        TypedValue typedValue = new TypedValue();
        this.f13578.getTheme().resolveAttribute(ru.bluecat.yandexmapspatcher.R.attr.actionBarWidgetTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.f13578, i);
            this.f13576 = contextThemeWrapper;
            return contextThemeWrapper;
        }
        Context context2 = this.f13578;
        this.f13576 = context2;
        return context2;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m7262(boolean z) {
        C1551 c1551M15;
        C1551 c1551M16;
        boolean z2 = this.f13572;
        if (z) {
            if (!z2) {
                this.f13572 = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f13568;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m7260(false);
            }
        } else if (z2) {
            this.f13572 = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f13568;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m7260(false);
        }
        boolean zIsLaidOut = this.f13579.isLaidOut();
        InterfaceC4870 interfaceC4870 = this.f13570;
        if (!zIsLaidOut) {
            if (z) {
                ((C0251) interfaceC4870).f930.setVisibility(4);
                this.f13571.setVisibility(0);
                return;
            } else {
                ((C0251) interfaceC4870).f930.setVisibility(0);
                this.f13571.setVisibility(8);
                return;
            }
        }
        if (z) {
            C0251 c0251 = (C0251) interfaceC4870;
            c1551M15 = AbstractC3608.m6432(c0251.f930);
            c1551M15.m3300(0.0f);
            c1551M15.m3297(100L);
            c1551M15.m3301(new C1809(c0251, 4));
            c1551M16 = this.f13571.m15(200L, 0);
        } else {
            C0251 c0252 = (C0251) interfaceC4870;
            C1551 c1551M6432 = AbstractC3608.m6432(c0252.f930);
            c1551M6432.m3300(1.0f);
            c1551M6432.m3297(200L);
            c1551M6432.m3301(new C1809(c0252, 0));
            c1551M15 = this.f13571.m15(100L, 8);
            c1551M16 = c1551M6432;
        }
        C4799 c4799 = new C4799();
        ArrayList arrayList = c4799.f15834;
        arrayList.add(c1551M15);
        View view = (View) c1551M15.f5238.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c1551M16.f5238.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c1551M16);
        c4799.m8176();
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m7263(boolean z) {
        if (this.f13577) {
            return;
        }
        int i = z ? 4 : 0;
        C0251 c0251 = (C0251) this.f13570;
        int i2 = c0251.f928;
        this.f13577 = true;
        c0251.m529((i & 4) | (i2 & (-5)));
    }

    public C4075(Dialog dialog) {
        new ArrayList();
        this.f13581 = new ArrayList();
        this.f13588 = 0;
        this.f13591 = true;
        this.f13573 = true;
        this.f13589 = new C0250(this, 0);
        this.f13575 = new C0250(this, 1);
        this.f13583 = new C1039(20, this);
        m7258(dialog.getWindow().getDecorView());
    }
}
