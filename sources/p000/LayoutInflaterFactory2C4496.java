package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦٙؕۤٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C4496 implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: ۦۨ */
    public final C2790 f14870;

    public LayoutInflaterFactory2C4496(C2790 c2790) {
        this.f14870 = c2790;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        C1239 c1239M5309;
        boolean zEquals = C5189.class.getName().equals(str);
        C2790 c2790 = this.f14870;
        if (zEquals) {
            return new C5189(context, attributeSet, c2790);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1108.f3895);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = AbstractComponentCallbacksC0308.class.isAssignableFrom(C3698.m6560(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308M5270 = resourceId != -1 ? c2790.m5270(resourceId) : null;
                    if (abstractComponentCallbacksC0308M5270 == null && string != null) {
                        C1489 c1489 = c2790.f9298;
                        ArrayList arrayList = (ArrayList) c1489.f5059;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = (AbstractComponentCallbacksC0308) arrayList.get(size);
                                if (abstractComponentCallbacksC0308 != null && string.equals(abstractComponentCallbacksC0308.f1150)) {
                                    abstractComponentCallbacksC0308M5270 = abstractComponentCallbacksC0308;
                                    break;
                                }
                                size--;
                            } else {
                                Iterator it = ((HashMap) c1489.f5057).values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        abstractComponentCallbacksC0308M5270 = null;
                                        break;
                                    }
                                    C1239 c1239 = (C1239) it.next();
                                    if (c1239 != null) {
                                        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = c1239.f4258;
                                        if (string.equals(abstractComponentCallbacksC0309.f1150)) {
                                            abstractComponentCallbacksC0308M5270 = abstractComponentCallbacksC0309;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (abstractComponentCallbacksC0308M5270 == null && id != -1) {
                        abstractComponentCallbacksC0308M5270 = c2790.m5270(id);
                    }
                    if (abstractComponentCallbacksC0308M5270 == null) {
                        C3698 c3698M5299 = c2790.m5299();
                        context.getClassLoader();
                        abstractComponentCallbacksC0308M5270 = c3698M5299.m6561(attributeValue);
                        abstractComponentCallbacksC0308M5270.f1137 = true;
                        abstractComponentCallbacksC0308M5270.f1146 = resourceId != 0 ? resourceId : id;
                        abstractComponentCallbacksC0308M5270.f1113 = id;
                        abstractComponentCallbacksC0308M5270.f1150 = string;
                        abstractComponentCallbacksC0308M5270.f1117 = true;
                        abstractComponentCallbacksC0308M5270.f1141 = c2790;
                        C0827 c0827 = c2790.f9309;
                        abstractComponentCallbacksC0308M5270.f1136 = c0827;
                        AbstractActivityC2747 abstractActivityC2747 = c0827.f2924;
                        abstractComponentCallbacksC0308M5270.f1139 = true;
                        if ((c0827 == null ? null : c0827.f2927) != null) {
                            abstractComponentCallbacksC0308M5270.f1139 = true;
                        }
                        c1239M5309 = c2790.m5289(abstractComponentCallbacksC0308M5270);
                        if (C2790.m5261(2)) {
                            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC0308M5270 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (abstractComponentCallbacksC0308M5270.f1117) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        abstractComponentCallbacksC0308M5270.f1117 = true;
                        abstractComponentCallbacksC0308M5270.f1141 = c2790;
                        C0827 c0828 = c2790.f9309;
                        abstractComponentCallbacksC0308M5270.f1136 = c0828;
                        AbstractActivityC2747 abstractActivityC2748 = c0828.f2924;
                        abstractComponentCallbacksC0308M5270.f1139 = true;
                        if ((c0828 == null ? null : c0828.f2927) != null) {
                            abstractComponentCallbacksC0308M5270.f1139 = true;
                        }
                        c1239M5309 = c2790.m5309(abstractComponentCallbacksC0308M5270);
                        if (C2790.m5261(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + abstractComponentCallbacksC0308M5270 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    C3168 c3168 = AbstractC3787.f12578;
                    AbstractC3787.m6703(new C3672(abstractComponentCallbacksC0308M5270, "Attempting to use <fragment> tag to add fragment " + abstractComponentCallbacksC0308M5270 + " to container " + viewGroup));
                    AbstractC3787.m6704(abstractComponentCallbacksC0308M5270).getClass();
                    abstractComponentCallbacksC0308M5270.f1127 = viewGroup;
                    c1239M5309.m2623();
                    c1239M5309.m2624();
                    C1078.m2276(AbstractC3761.m6629("Fragment ", attributeValue, " did not create a view."));
                    return null;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
