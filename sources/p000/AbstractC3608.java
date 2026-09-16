package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦؚؖؖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3608 {

    /* JADX INFO: renamed from: ۥؗ */
    public static boolean f12010 = false;

    /* JADX INFO: renamed from: ۥۗ */
    public static Field f12012;

    /* JADX INFO: renamed from: ۥۣ */
    public static WeakHashMap f12013;

    /* JADX INFO: renamed from: ۦؑ */
    public static final C4614 f12014 = new C4614();

    /* JADX INFO: renamed from: ۥُ */
    public static final ViewTreeObserverOnGlobalLayoutListenerC5809 f12011 = new ViewTreeObserverOnGlobalLayoutListenerC5809();

    /* JADX INFO: renamed from: ۥؗ */
    public static boolean m6427(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C4947.f16369;
        C4947 c4947 = (C4947) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (c4947 == null) {
            c4947 = new C4947();
            c4947.f16372 = null;
            c4947.f16371 = null;
            c4947.f16370 = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c4947);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c4947.f16372;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = C4947.f16369;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (c4947.f16372 == null) {
                            c4947.f16372 = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = C4947.f16369;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                c4947.f16372.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    c4947.f16372.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        View viewM8331 = c4947.m8331(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewM8331 != null && !KeyEvent.isModifierKey(keyCode)) {
                SparseArray sparseArray = c4947.f16371;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    c4947.f16371 = sparseArray;
                }
                sparseArray.put(keyCode, new WeakReference(viewM8331));
            }
        }
        return viewM8331 != null;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static View.AccessibilityDelegate m6428(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC3699.m6563(view);
        }
        if (f12010) {
            return null;
        }
        if (f12012 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f12012 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f12010 = true;
                return null;
            }
        }
        try {
            Object obj = f12012.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f12010 = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public static String[] m6429(C5396 c5396) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC4494.m7824(c5396) : (String[]) c5396.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m6430(View view, C2639 c2639) {
        WindowInsets windowInsetsM4955 = c2639.m4955();
        if (windowInsetsM4955 != null) {
            WindowInsets windowInsetsM8024 = Build.VERSION.SDK_INT >= 30 ? AbstractC4631.m8024(view, windowInsetsM4955) : AbstractC2726.m5071(view, windowInsetsM4955);
            if (windowInsetsM8024.equals(windowInsetsM4955)) {
                return;
            }
            C2639.m4953(windowInsetsM8024, view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥۜ */
    public static C5336 m6431(View view, C5336 c5336) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c5336 + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC4494.m7823(view, c5336);
        }
        C5840 c5840 = (C5840) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC4062 interfaceC4062 = f12014;
        if (c5840 == null) {
            if (view instanceof InterfaceC4062) {
                interfaceC4062 = (InterfaceC4062) view;
            }
            return interfaceC4062.mo7254(c5336);
        }
        C5336 c5336M9649 = C5840.m9649(view, c5336);
        if (c5336M9649 == null) {
            return null;
        }
        if (view instanceof InterfaceC4062) {
            interfaceC4062 = (InterfaceC4062) view;
        }
        return interfaceC4062.mo7254(c5336M9649);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C1551 m6432(View view) {
        WeakHashMap weakHashMap = f12013;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            f12013 = weakHashMap;
        }
        C1551 c1551 = (C1551) weakHashMap.get(view);
        if (c1551 != null) {
            return c1551;
        }
        C1551 c1552 = new C1551(view);
        f12013.put(view, c1552);
        return c1552;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static boolean m6433(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = C4947.f16369;
            C4947 c4947 = (C4947) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (c4947 == null) {
                c4947 = new C4947();
                c4947.f16372 = null;
                c4947.f16371 = null;
                c4947.f16370 = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, c4947);
            }
            WeakReference weakReference2 = c4947.f16370;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                c4947.f16370 = new WeakReference(keyEvent);
                SparseArray sparseArray = c4947.f16371;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    c4947.f16371 = sparseArray;
                }
                if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
                    sparseArray.removeAt(iIndexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    C0178.m382();
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦِ */
    public static void m6434(View view, C0004 c0004) {
        if (c0004 == null && (m6428(view) instanceof C0030)) {
            c0004 = new C0004();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0004 == null ? null : c0004.f869);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static void m6435(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC3699.m6562(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static void m6436(View view, CharSequence charSequence) {
        new C1932(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).m8334(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC5809 viewTreeObserverOnGlobalLayoutListenerC5809 = f12011;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC5809.f19133.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC5809);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC5809);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC5809.f19133.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC5809);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC5809);
            }
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static void m6437(View view, int i) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i2 = Build.VERSION.SDK_INT;
            Object objM6462 = null;
            if (i2 >= 28) {
                tag = AbstractC3629.m6462(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    List<CharSequence> text = accessibilityEventObtain.getText();
                    if (i2 >= 28) {
                        objM6462 = AbstractC3629.m6462(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            objM6462 = tag2;
                        }
                    }
                    text.add((CharSequence) objM6462);
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            List<CharSequence> text2 = accessibilityEventObtain2.getText();
            if (i2 >= 28) {
                objM6462 = AbstractC3629.m6462(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    objM6462 = tag3;
                }
            }
            text2.add((CharSequence) objM6462);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }
}
