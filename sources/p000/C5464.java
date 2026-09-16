package p000;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: ۦۡؔ۟ؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5464 {

    /* JADX INFO: renamed from: ۥُ */
    public static final C5464 f18015;

    /* JADX INFO: renamed from: ۥّ */
    public static final C5464 f18016;

    /* JADX INFO: renamed from: ۥۜ */
    public static final C5464 f18017;

    /* JADX INFO: renamed from: ۦؑ */
    public static final C5464 f18018;

    /* JADX INFO: renamed from: ۦِ */
    public static final C5464 f18019;

    /* JADX INFO: renamed from: ۦٛ */
    public static final C5464 f18020;

    /* JADX INFO: renamed from: ۦۗ */
    public static final C5464 f18021;

    /* JADX INFO: renamed from: ۦۙ */
    public static final C5464 f18022;

    /* JADX INFO: renamed from: ۥؗ */
    public final Class f18023;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f18024;

    /* JADX INFO: renamed from: ۥۣ */
    public final Object f18025;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
        new C5464(1, (String) null);
        new C5464(2, (String) null);
        new C5464(4, (String) null);
        new C5464(8, (String) null);
        new C5464(16, (String) null);
        new C5464(32, (String) null);
        f18018 = new C5464(64, (String) null);
        f18015 = new C5464(128, (String) null);
        new C5464(256, AbstractC3885.class);
        new C5464(512, AbstractC3885.class);
        new C5464(1024, AbstractC5344.class);
        new C5464(2048, AbstractC5344.class);
        f18016 = new C5464(4096, (String) null);
        f18022 = new C5464(8192, (String) null);
        new C5464(16384, (String) null);
        new C5464(32768, (String) null);
        new C5464(65536, (String) null);
        new C5464(131072, AbstractC3956.class);
        new C5464(262144, (String) null);
        new C5464(524288, (String) null);
        new C5464(1048576, (String) null);
        new C5464(2097152, AbstractC4140.class);
        new C5464(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new C5464(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AbstractC0112.class);
        f18017 = new C5464(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        f18020 = new C5464(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f18019 = new C5464(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        f18021 = new C5464(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        int i = Build.VERSION.SDK_INT;
        new C5464(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new C5464(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new C5464(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new C5464(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new C5464(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new C5464(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, AbstractC1461.class);
        new C5464(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, AbstractC1216.class);
        new C5464(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new C5464(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new C5464(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new C5464(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new C5464(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new C5464(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new C5464(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new C5464(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new C5464(i >= 34 ? AbstractC0002.m175() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        int i2 = AbstractC2737.f9062;
        if (i >= 36) {
            if ((i < 36 ? i * 100000 : Build.VERSION.SDK_INT_FULL) >= 3600001) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_EXTENDED_SELECTION;
            }
        }
        new C5464(accessibilityAction, R.id.ALT, null, null, null);
    }

    public C5464(Object obj, int i, CharSequence charSequence, InterfaceC0150 interfaceC0150, Class cls) {
        this.f18024 = i;
        if (obj == null) {
            this.f18025 = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
        } else {
            this.f18025 = obj;
        }
        this.f18023 = cls;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C5464)) {
            return false;
        }
        Object obj2 = ((C5464) obj).f18025;
        Object obj3 = this.f18025;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f18025;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strM9626 = C5817.m9626(this.f18024);
        if (strM9626.equals("ACTION_UNKNOWN")) {
            Object obj = this.f18025;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strM9626 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strM9626);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m9152() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f18025).getId();
    }

    public C5464(int i, Class cls) {
        this(null, i, null, null, cls);
    }

    public C5464(int i, String str) {
        this(null, i, str, null, null);
    }
}
