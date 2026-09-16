package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: ۦۡؕٓٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC5472 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ۥَ */
    public RunnableC1316 f18051;

    /* JADX INFO: renamed from: ۥْ */
    public final int f18052;

    /* JADX INFO: renamed from: ۥٓ */
    public final View f18053;

    /* JADX INFO: renamed from: ۥٖ */
    public RunnableC1316 f18054;

    /* JADX INFO: renamed from: ۥۖ */
    public final int[] f18055 = new int[2];

    /* JADX INFO: renamed from: ۦٗ */
    public boolean f18056;

    /* JADX INFO: renamed from: ۦۛ */
    public int f18057;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f18058;

    /* JADX INFO: renamed from: ۦۨ */
    public final float f18059;

    public AbstractViewOnTouchListenerC5472(View view) {
        this.f18053 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f18059 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f18058 = tapTimeout;
        this.f18052 = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        C1391 c1391Mo1019;
        boolean z2 = this.f18056;
        View view2 = this.f18053;
        if (z2) {
            InterfaceC0470 interfaceC0470Mo5073 = mo5073();
            if (interfaceC0470Mo5073 != null && interfaceC0470Mo5073.mo1018() && (c1391Mo1019 = interfaceC0470Mo5073.mo1019()) != null && c1391Mo1019.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f18055;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c1391Mo1019.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zM2952 = c1391Mo1019.m2952(motionEventObtainNoHistory, this.f18057);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zM2952 && z3) {
                    z = true;
                } else if (mo6819()) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (mo6819()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f18057 = motionEvent.getPointerId(0);
                    RunnableC1316 runnableC1316 = this.f18051;
                    if (runnableC1316 == null) {
                        runnableC1316 = new RunnableC1316(this, 0);
                        this.f18051 = runnableC1316;
                    }
                    view2.postDelayed(runnableC1316, this.f18058);
                    RunnableC1316 runnableC1317 = this.f18054;
                    if (runnableC1317 == null) {
                        runnableC1317 = new RunnableC1316(this, 1);
                        this.f18054 = runnableC1317;
                    }
                    view2.postDelayed(runnableC1317, this.f18052);
                } else if (actionMasked2 == 1) {
                    m9167();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f18057);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.f18059;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            m9167();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (mo5072()) {
                                z = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    m9167();
                }
                z = false;
            } else {
                z = false;
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f18056 = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f18056 = false;
        this.f18057 = -1;
        RunnableC1316 runnableC1316 = this.f18051;
        if (runnableC1316 != null) {
            this.f18053.removeCallbacks(runnableC1316);
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public abstract boolean mo5072();

    /* JADX INFO: renamed from: ۥۗ */
    public abstract InterfaceC0470 mo5073();

    /* JADX INFO: renamed from: ۥۣ */
    public final void m9167() {
        RunnableC1316 runnableC1316 = this.f18054;
        View view = this.f18053;
        if (runnableC1316 != null) {
            view.removeCallbacks(runnableC1316);
        }
        RunnableC1316 runnableC1317 = this.f18051;
        if (runnableC1317 != null) {
            view.removeCallbacks(runnableC1317);
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public boolean mo6819() {
        InterfaceC0470 interfaceC0470Mo5073 = mo5073();
        if (interfaceC0470Mo5073 == null || !interfaceC0470Mo5073.mo1018()) {
            return true;
        }
        interfaceC0470Mo5073.dismiss();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
