package p000;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦؒ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0054 extends ViewGroup {

    /* JADX INFO: renamed from: ۥَ */
    public C5686 f10331;

    /* JADX INFO: renamed from: ۥْ */
    public C2074 f10332;

    /* JADX INFO: renamed from: ۥٓ */
    public AbstractC2109 f10333;

    /* JADX INFO: renamed from: ۥٖ */
    public C4811 f10334;

    /* JADX INFO: renamed from: ۥۖ */
    public boolean f10335;

    /* JADX INFO: renamed from: ۦٗ */
    public boolean f10336;

    /* JADX INFO: renamed from: ۦۛ */
    public boolean f10337;

    /* JADX INFO: renamed from: ۦ۟ */
    public IBinder f10338;

    /* JADX INFO: renamed from: ۦۨ */
    public WeakReference f10339;

    public AbstractC0054(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        ViewOnAttachStateChangeListenerC3944 viewOnAttachStateChangeListenerC3944 = new ViewOnAttachStateChangeListenerC3944(3, this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC3944);
        C2316 c2316 = new C2316();
        AbstractC1434.m3033(this).f661.add(c2316);
        this.f10334 = new C4811(this, viewOnAttachStateChangeListenerC3944, c2316, 1);
    }

    private final void setParentContext(AbstractC2109 abstractC2109) {
        if (this.f10333 != abstractC2109) {
            this.f10333 = abstractC2109;
            if (abstractC2109 != null) {
                this.f10339 = null;
            }
            C2074 c2074 = this.f10332;
            if (c2074 != null) {
                c2074.m4017();
                this.f10332 = null;
                if (isAttachedToWindow()) {
                    m5669();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f10338 != iBinder) {
            this.f10338 = iBinder;
            this.f10339 = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        m5667();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m5667();
        return super.addViewInLayout(view, i, layoutParams);
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m9879getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        C1956 c1956 = tag instanceof C1956 ? (C1956) tag : null;
        if (c1956 != null) {
            return c1956.f6453;
        }
        return 1;
    }

    public final C5686 getComposeViewContext$ui() {
        return this.f10331;
    }

    public final boolean getHasComposition() {
        return this.f10332 != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f10336;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f10335 || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C3262 c3262 = AbstractC3937.f13146;
        Object objM7476 = AbstractC4225.m7476(this);
        View view = this;
        while (objM7476 instanceof View) {
            View view2 = (View) objM7476;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objM7476 = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new RunnableC0029(0, this));
        } else {
            m5670();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mo1383(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        m5669();
        mo1385(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m9880setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new C1956(i));
    }

    public final void setComposeViewContext$ui(C5686 c5686) {
        if (this.f10331 != c5686) {
            if (c5686 == null) {
                m5668();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC0850 ? (ViewTreeObserverOnGlobalLayoutListenerC0850) childAt : null;
                if (viewTreeObserverOnGlobalLayoutListenerC0850 != null) {
                    if (viewTreeObserverOnGlobalLayoutListenerC0850.getCoroutineContext() != c5686.f18698.mo1009()) {
                        m5668();
                    }
                    viewTreeObserverOnGlobalLayoutListenerC0850.setComposeViewContext(c5686);
                }
            }
            this.f10331 = c5686;
        }
    }

    public final void setParentCompositionContext(AbstractC2109 abstractC2109) {
        setParentContext(abstractC2109);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.f10336 = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0850) ((InterfaceC2043) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.f10335 = true;
    }

    public final void setViewCompositionStrategy(InterfaceC3819 interfaceC3819) {
        C4811 c4811 = this.f10334;
        if (c4811 != null) {
            c4811.mo449();
        }
        ((AbstractC2776) interfaceC3819).getClass();
        ViewOnAttachStateChangeListenerC3944 viewOnAttachStateChangeListenerC3944 = new ViewOnAttachStateChangeListenerC3944(3, this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC3944);
        C2316 c2316 = new C2316();
        AbstractC1434.m3033(this).f661.add(c2316);
        this.f10334 = new C4811(this, viewOnAttachStateChangeListenerC3944, c2316, 1);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m5667() {
        if (this.f10337) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m5668() {
        View childAt = getChildAt(0);
        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC0850 ? (ViewTreeObserverOnGlobalLayoutListenerC0850) childAt : null;
        if (viewTreeObserverOnGlobalLayoutListenerC0850 != null && viewTreeObserverOnGlobalLayoutListenerC0850.f3127) {
            viewTreeObserverOnGlobalLayoutListenerC0850.getComposeViewContext().m9501();
            viewTreeObserverOnGlobalLayoutListenerC0850.f3127 = false;
        }
        C2074 c2074 = this.f10332;
        if (c2074 != null) {
            c2074.m4017();
        }
        this.f10332 = null;
        requestLayout();
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m5669() {
        if (this.f10332 == null) {
            int i = 0;
            try {
                this.f10337 = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    C5686 c5686M5673 = this.f10331;
                    if (c5686M5673 == null) {
                        c5686M5673 = m5673();
                    }
                    this.f10332 = AbstractC2433.m4546(this, c5686M5673, new C0857(1003123809, new C0046(i, this), true));
                    Trace.endSection();
                    this.f10337 = false;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                this.f10337 = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m5670() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.f10331 == null) {
                ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC0850) {
                        viewTreeObserverOnGlobalLayoutListenerC0850 = (ViewTreeObserverOnGlobalLayoutListenerC0850) childAt;
                    }
                }
                if (viewTreeObserverOnGlobalLayoutListenerC0850 != null) {
                    viewTreeObserverOnGlobalLayoutListenerC0850.setComposeViewContext(m5672(AbstractC2133.m4160(this), viewTreeObserverOnGlobalLayoutListenerC0850.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                m5669();
            }
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public void mo1383(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public abstract void mo1384(int i, C5362 c5362);

    /* JADX INFO: renamed from: ۦؑ */
    public final void m5671() {
        C5686 c5686;
        if (this.f10333 != null || isAttachedToWindow() || ((c5686 = this.f10331) != null && c5686.f18700.isAttachedToWindow())) {
            m5669();
        } else {
            C1078.m2276("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final C5686 m5672(View view, C5686 c5686) {
        AbstractC2109 abstractC2109M5674 = m5674();
        InterfaceC4507 interfaceC4507M9365 = AbstractC5568.m9365(view);
        InterfaceC4680 interfaceC4680M6743 = AbstractC3801.m6743(view);
        InterfaceC3983 interfaceC3983M7995 = AbstractC4593.m7995(view);
        AbstractC2109 abstractC2109 = c5686.f18698;
        InterfaceC3983 interfaceC3983 = c5686.f18701;
        InterfaceC4507 interfaceC4507 = c5686.f18690;
        if (abstractC2109M5674 == abstractC2109 && interfaceC4507M9365 == interfaceC4507 && interfaceC4680M6743 == c5686.f18692 && interfaceC3983M7995 == interfaceC3983) {
            return c5686;
        }
        if (abstractC2109M5674.mo1009() != c5686.f18698.mo1009()) {
            m5668();
        }
        if (interfaceC4507M9365 == null) {
            interfaceC4507M9365 = interfaceC4507;
        }
        C5686 c5687 = new C5686(c5686, view, abstractC2109M5674, interfaceC4507M9365, interfaceC3983M7995 == null ? interfaceC3983 : interfaceC3983M7995, interfaceC4680M6743);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(c5687));
        return c5687;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    /* JADX INFO: renamed from: ۦِ */
    public final C5686 m5673() {
        C5686 composeViewContext;
        InterfaceC4680 interfaceC4680;
        if (getChildCount() == 0) {
            composeViewContext = null;
        } else {
            View childAt = getChildAt(0);
            ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC0850 ? (ViewTreeObserverOnGlobalLayoutListenerC0850) childAt : null;
            if (viewTreeObserverOnGlobalLayoutListenerC0850 != null) {
                composeViewContext = viewTreeObserverOnGlobalLayoutListenerC0850.getComposeViewContext();
            } else {
                composeViewContext = null;
            }
        }
        View viewM4160 = AbstractC2133.m4160(this);
        C5686 c5686M4125 = AbstractC2133.m4125(viewM4160);
        if (c5686M4125 != null) {
            return m5672(viewM4160, c5686M4125);
        }
        AbstractC2109 abstractC2109M5674 = m5674();
        InterfaceC4507 interfaceC4507M9365 = AbstractC5568.m9365(viewM4160);
        if (interfaceC4507M9365 == null) {
            interfaceC4507M9365 = composeViewContext != null ? composeViewContext.f18690 : null;
            if (interfaceC4507M9365 == null) {
                C1078.m2276("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return null;
            }
        }
        InterfaceC4507 interfaceC4507 = interfaceC4507M9365;
        InterfaceC3983 interfaceC3983M7995 = AbstractC4593.m7995(viewM4160);
        if (interfaceC3983M7995 == null) {
            interfaceC3983M7995 = composeViewContext != null ? composeViewContext.f18701 : null;
            if (interfaceC3983M7995 == null) {
                C1078.m2276("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return null;
            }
        }
        InterfaceC3983 interfaceC3983 = interfaceC3983M7995;
        InterfaceC4680 interfaceC4680M6743 = AbstractC3801.m6743(viewM4160);
        if (interfaceC4680M6743 == null) {
            interfaceC4680 = composeViewContext != null ? composeViewContext.f18692 : null;
        } else {
            interfaceC4680 = interfaceC4680M6743;
        }
        C5686 c5686 = new C5686(AbstractC2133.m4125(AbstractC2133.m4160(viewM4160)), viewM4160, abstractC2109M5674, interfaceC4507, interfaceC3983, interfaceC4680);
        viewM4160.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(c5686));
        return c5686;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public void mo1385(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final AbstractC2109 m5674() {
        C0469 c0469;
        InterfaceC3534 interfaceC3534;
        C2404 c2404;
        int i;
        Object objM7476;
        AbstractC2109 abstractC2109M7103 = this.f10333;
        if (abstractC2109M7103 == null) {
            abstractC2109M7103 = AbstractC3937.m7103(this);
            if (abstractC2109M7103 == null) {
                ViewParent parent = getParent();
                while (true) {
                    if (abstractC2109M7103 != null || !(objM7476 instanceof View)) {
                        objM7476 = parent;
                        break;
                    }
                    objM7476 = parent;
                    View view = (View) objM7476;
                    abstractC2109M7103 = AbstractC3937.m7103(view);
                    objM7476 = AbstractC4225.m7476(view);
                }
            }
            boolean z = false;
            if (abstractC2109M7103 != null) {
                AbstractC2109 abstractC2109 = (!(abstractC2109M7103 instanceof C0469) || ((EnumC3359) ((C0469) abstractC2109M7103).f1710.getValue()).compareTo(EnumC3359.f11229) > 0) ? abstractC2109M7103 : null;
                if (abstractC2109 != null) {
                    this.f10339 = new WeakReference(abstractC2109);
                }
            } else {
                abstractC2109M7103 = null;
            }
            if (abstractC2109M7103 == null) {
                WeakReference weakReference = this.f10339;
                if (weakReference == null || (abstractC2109M7103 = (AbstractC2109) weakReference.get()) == null || ((abstractC2109M7103 instanceof C0469) && ((EnumC3359) ((C0469) abstractC2109M7103).f1710.getValue()).compareTo(EnumC3359.f11229) <= 0)) {
                    abstractC2109M7103 = null;
                }
                if (abstractC2109M7103 == null) {
                    if (!isAttachedToWindow()) {
                        AbstractC3480.m6278("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    View view2 = this;
                    Object parent2 = AbstractC4225.m7476(this);
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    AbstractC2109 abstractC2109M7104 = AbstractC3937.m7103(view2);
                    if (abstractC2109M7104 == null) {
                        ((C4871) AbstractC5321.f17565.get()).getClass();
                        InterfaceC3534 interfaceC3535 = C4794.f15814;
                        C2432 c2432 = C5418.f17882;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            interfaceC3534 = (InterfaceC3534) C5418.f17882.getValue();
                        } else {
                            interfaceC3534 = (InterfaceC3534) C5418.f17881.get();
                            if (interfaceC3534 == null) {
                                C1078.m2276("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        InterfaceC3534 interfaceC3534Mo860 = interfaceC3534.mo860(interfaceC3535);
                        C2404 c2405 = (C2404) interfaceC3534Mo860.mo865(C0373.f1374);
                        if (c2405 != null) {
                            c2404 = new C2404(c2405);
                            C1405 c1405 = (C1405) c2404.f8010;
                            synchronized (c1405.f4836) {
                                c1405.f4837 = false;
                            }
                        } else {
                            c2404 = null;
                        }
                        C5450 c5450 = new C5450();
                        InterfaceC3534 c1673 = (InterfaceC3800) interfaceC3534Mo860.mo865(C1298.f4434);
                        if (c1673 == null) {
                            c1673 = new C1673(view2.getContext().getApplicationContext());
                            c5450.f17965 = c1673;
                        }
                        if (c2404 != null) {
                            interfaceC3535 = c2404;
                        }
                        InterfaceC3534 interfaceC3534Mo861 = interfaceC3534Mo860.mo860(interfaceC3535).mo860(c1673);
                        c0469 = new C0469(interfaceC3534Mo861);
                        synchronized (c0469.f1693) {
                            i = 1;
                            c0469.f1699 = true;
                        }
                        C3950 c3950M7151 = AbstractC4009.m7151(interfaceC3534Mo861);
                        InterfaceC4507 interfaceC4507M9365 = AbstractC5568.m9365(view2);
                        AbstractC1434 abstractC1434Mo110 = interfaceC4507M9365 != null ? interfaceC4507M9365.mo110() : null;
                        if (abstractC1434Mo110 == null) {
                            AbstractC3480.m6277("ViewTreeLifecycleOwner not found from " + view2);
                            C1078.m2274();
                            return null;
                        }
                        view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3112(view2, c0469, i));
                        abstractC1434Mo110.mo2388(new C0786(c3950M7151, c2404, c0469, c5450));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, c0469);
                        C5276 c5276 = C5276.f17389;
                        Handler handler = view2.getHandler();
                        int i2 = AbstractC5487.f18096;
                        view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3944(4, AbstractC2765.m5135(c5276, new C5136(handler, "windowRecomposer cleanup", false).f17018, 0, new C5030(c0469, view2, z ? 1 : 0, 24), 2)));
                    } else {
                        if (!(abstractC2109M7104 instanceof C0469)) {
                            C1078.m2276("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        c0469 = (C0469) abstractC2109M7104;
                    }
                    C0469 c04610 = ((EnumC3359) c0469.f1710.getValue()).compareTo(EnumC3359.f11229) > 0 ? c0469 : null;
                    if (c04610 != null) {
                        this.f10339 = new WeakReference(c04610);
                    }
                    return c0469;
                }
            }
        }
        return abstractC2109M7103;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        m5667();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        m5667();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        m5667();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m5667();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m5667();
        super.addView(view, i, layoutParams);
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
