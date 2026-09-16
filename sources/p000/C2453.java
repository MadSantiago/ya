package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import java.util.UUID;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥؘ۟ؔ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2453 extends AbstractC0054 {

    /* JADX INFO: renamed from: ۥؓ */
    public final View f8167;

    /* JADX INFO: renamed from: ۥؔ */
    public final C5389 f8168;

    /* JADX INFO: renamed from: ۥؖ */
    public String f8169;

    /* JADX INFO: renamed from: ۥً */
    public final C4992 f8170;

    /* JADX INFO: renamed from: ۥٕ */
    public final WindowManager.LayoutParams f8171;

    /* JADX INFO: renamed from: ۥ٘ */
    public boolean f8172;

    /* JADX INFO: renamed from: ۥٙ */
    public C5236 f8173;

    /* JADX INFO: renamed from: ۥٛ */
    public final int[] f8174;

    /* JADX INFO: renamed from: ۥۙ */
    public InterfaceC4396 f8175;

    /* JADX INFO: renamed from: ۥۦ */
    public final C4852 f8176;

    /* JADX INFO: renamed from: ۥۧ */
    public final boolean f8177;

    /* JADX INFO: renamed from: ۦؖ */
    public final C4852 f8178;

    /* JADX INFO: renamed from: ۦؗ */
    public C4730 f8179;

    /* JADX INFO: renamed from: ۦؙ */
    public EnumC2459 f8180;

    /* JADX INFO: renamed from: ۦُ */
    public final C5704 f8181;

    /* JADX INFO: renamed from: ۦٕ */
    public InterfaceC4448 f8182;

    /* JADX INFO: renamed from: ۦٖ */
    public final Rect f8183;

    /* JADX INFO: renamed from: ۦٚ */
    public final WindowManager f8184;

    /* JADX INFO: renamed from: ۦۜ */
    public C4723 f8185;

    /* JADX INFO: renamed from: ۦۣ */
    public final C4852 f8186;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2453(InterfaceC4448 interfaceC4448, C5236 c5236, String str, View view, InterfaceC2880 interfaceC2880, InterfaceC4396 interfaceC4396, UUID uuid, boolean z) {
        super(view.getContext());
        int i = Build.VERSION.SDK_INT;
        int i2 = 22;
        C4992 c5377 = i >= 30 ? new C5377(i2) : i >= 29 ? new C1448(i2) : new C4992(i2);
        this.f8182 = interfaceC4448;
        this.f8173 = c5236;
        this.f8169 = str;
        this.f8167 = view;
        this.f8177 = z;
        this.f8170 = c5377;
        this.f8184 = (WindowManager) view.getContext().getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        C5236 c5237 = this.f8173;
        boolean zM5616 = AbstractC3026.m5616(view);
        boolean z2 = c5237.f17290;
        int i3 = c5237.f17291;
        if (z2 && zM5616) {
            i3 |= 8192;
        } else if (z2 && !zM5616) {
            i3 &= -8193;
        }
        layoutParams.flags = i3;
        layoutParams.type = this.f8173.f17289;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f8171 = layoutParams;
        this.f8175 = interfaceC4396;
        this.f8180 = EnumC2459.f8215;
        this.f8178 = AbstractC2774.m5183(null);
        this.f8176 = AbstractC2774.m5183(null);
        this.f8181 = AbstractC3004.m5600(new C5285(18, this));
        this.f8183 = new Rect();
        this.f8168 = new C5389(new C4399(this, 2));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, AbstractC5568.m9365(view));
        setTag(R.id.view_tree_view_model_store_owner, AbstractC3801.m6743(view));
        setTag(R.id.view_tree_saved_state_registry_owner, AbstractC4593.m7995(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(interfaceC2880.mo741(8.0f));
        setOutlineProvider(new C1693(2));
        this.f8186 = AbstractC2774.m5183(AbstractC1559.f5253);
        this.f8174 = new int[2];
    }

    private final InterfaceC5731 getContent() {
        return (InterfaceC5731) this.f8186.getValue();
    }

    private final C4730 getDisplayBounds() {
        int i = this.f8173.f17291 & 512;
        View view = this.f8167;
        Rect rect = this.f8183;
        C4992 c4992 = this.f8170;
        if (i == 0) {
            c4992.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            c4992.mo8382(view, rect);
        }
        return new C4730(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC2015 getParentLayoutCoordinates() {
        return (InterfaceC2015) this.f8176.getValue();
    }

    private final void setContent(InterfaceC5731 interfaceC5731) {
        this.f8186.setValue(interfaceC5731);
    }

    private final void setParentLayoutCoordinates(InterfaceC2015 interfaceC2015) {
        this.f8176.setValue(interfaceC2015);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f8173.f17287) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                InterfaceC4448 interfaceC4448 = this.f8182;
                if (interfaceC4448 != null) {
                    interfaceC4448.mo449();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f8181.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.f8171;
    }

    public final EnumC2459 getParentLayoutDirection() {
        return this.f8180;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final C4207 m9800getPopupContentSizebOM6tXw() {
        return (C4207) this.f8178.getValue();
    }

    public final InterfaceC4396 getPositionProvider() {
        return this.f8175;
    }

    @Override // p000.AbstractC0054
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f8172;
    }

    public final String getTestTag() {
        return this.f8169;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // p000.AbstractC0054, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8168.m9080();
        if (!this.f8173.f17287 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        C4723 c4723 = this.f8185;
        if (c4723 == null) {
            C4723 c4724 = new C4723(0, this.f8182);
            this.f8185 = c4724;
            c4723 = c4724;
        }
        AbstractC2207.m4265(this, c4723);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C5389 c5389 = this.f8168;
        C5322 c5322 = c5389.f17814;
        if (c5322 != null) {
            c5322.m8926();
        }
        c5389.m9079();
        if (Build.VERSION.SDK_INT >= 33) {
            AbstractC2207.m4266(this, this.f8185);
        }
        this.f8185 = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f8173.f17292) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            InterfaceC4448 interfaceC4448 = this.f8182;
            if (interfaceC4448 != null) {
                interfaceC4448.mo449();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            InterfaceC4448 interfaceC4449 = this.f8182;
            if (interfaceC4449 != null) {
                interfaceC4449.mo449();
            }
        }
        return true;
    }

    public final void setParentLayoutDirection(EnumC2459 enumC2459) {
        this.f8180 = enumC2459;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m9801setPopupContentSizefhxjrPA(C4207 c4207) {
        this.f8178.setValue(c4207);
    }

    public final void setPositionProvider(InterfaceC4396 interfaceC4396) {
        this.f8175 = interfaceC4396;
    }

    public final void setTestTag(String str) {
        this.f8169 = str;
    }

    /* JADX INFO: renamed from: ۥْ */
    public final void m4577(InterfaceC2015 interfaceC2015) {
        setParentLayoutCoordinates(interfaceC2015);
        m4580();
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final void m4578() {
        C4207 c4207M9800getPopupContentSizebOM6tXw;
        C4730 c4730 = this.f8179;
        if (c4730 == null || (c4207M9800getPopupContentSizebOM6tXw = m9800getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = c4207M9800getPopupContentSizebOM6tXw.f13969;
        C4730 displayBounds = getDisplayBounds();
        long j2 = (((long) (displayBounds.f15613 - displayBounds.f15611)) & 4294967295L) | (((long) (displayBounds.f15610 - displayBounds.f15612)) << 32);
        C1314 c1314 = new C1314();
        c1314.f4535 = 0L;
        this.f8168.m9077(this, C3948.f13202, new C0632(c1314, this, c4730, j2, j));
        long j3 = c1314.f4535;
        WindowManager.LayoutParams layoutParams = this.f8171;
        layoutParams.x = (int) (j3 >> 32);
        layoutParams.y = (int) (j3 & 4294967295L);
        boolean z = this.f8173.f17288;
        C4992 c4992 = this.f8170;
        if (z) {
            c4992.mo3073(this, (int) (j2 >> 32), (int) (j2 & 4294967295L));
        }
        c4992.getClass();
        this.f8184.updateViewLayout(this, layoutParams);
    }

    @Override // p000.AbstractC0054
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo1383(boolean z, int i, int i2, int i3, int i4) {
        super.mo1383(z, i, i2, i3, i4);
        this.f8173.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.f8171;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.f8170.getClass();
        this.f8184.updateViewLayout(this, layoutParams);
    }

    @Override // p000.AbstractC0054
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1384(int i, C5362 c5362) {
        c5362.m8979(-857613600);
        int i2 = (c5362.m8977(this) ? 4 : 2) | i;
        if (c5362.m9011(i2 & 1, (i2 & 3) != 2)) {
            getContent().mo219(c5362, 0);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0046(this, i, 6);
        }
    }

    @Override // p000.AbstractC0054
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo1385(int i, int i2) {
        this.f8173.getClass();
        C4730 displayBounds = getDisplayBounds();
        super.mo1385(View.MeasureSpec.makeMeasureSpec(displayBounds.f15610 - displayBounds.f15612, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.f15613 - displayBounds.f15611, Integer.MIN_VALUE));
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final void m4579(AbstractC2109 abstractC2109, InterfaceC5731 interfaceC5731) {
        setParentCompositionContext(abstractC2109);
        setContent(interfaceC5731);
        this.f8172 = true;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final void m4580() {
        InterfaceC2015 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.mo2807()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jMo2799 = parentLayoutCoordinates.mo2799();
            long jMo2779 = this.f8177 ? parentLayoutCoordinates.mo2779(0L) : parentLayoutCoordinates.mo2802(0L);
            long jRound = (((long) Math.round(Float.intBitsToFloat((int) (jMo2779 >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jMo2779 & 4294967295L)))) & 4294967295L);
            int i = (int) (jRound >> 32);
            int i2 = (int) (jRound & 4294967295L);
            C4730 c4730 = new C4730(i, i2, ((int) (jMo2799 >> 32)) + i, ((int) (jMo2799 & 4294967295L)) + i2);
            if (c4730.equals(this.f8179)) {
                return;
            }
            this.f8179 = c4730;
            m4578();
        }
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final void m4581(InterfaceC4448 interfaceC4448, C5236 c5236, String str, EnumC2459 enumC2459) {
        int i;
        this.f8182 = interfaceC4448;
        this.f8169 = str;
        if (!AbstractC3831.m6874(this.f8173, c5236)) {
            this.f8173 = c5236;
            boolean zM5616 = AbstractC3026.m5616(this.f8167);
            boolean z = c5236.f17290;
            int i2 = c5236.f17291;
            if (z && zM5616) {
                i2 |= 8192;
            } else if (z && !zM5616) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.f8171;
            layoutParams.flags = i2;
            this.f8170.getClass();
            this.f8184.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = enumC2459.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                C1078.m2275();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public AbstractC0054 getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
