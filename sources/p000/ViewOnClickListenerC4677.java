package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ۦٜٖؓؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC4677 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۥْ */
    public Method f15410;

    /* JADX INFO: renamed from: ۥٓ */
    public Context f15411;

    /* JADX INFO: renamed from: ۦ۟ */
    public final String f15412;

    /* JADX INFO: renamed from: ۦۨ */
    public final View f15413;

    public ViewOnClickListenerC4677(View view, String str) {
        this.f15413 = view;
        this.f15412 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        Method method2 = this.f15410;
        if (method2 == null) {
            View view2 = this.f15413;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f15412;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f15410 = method;
                        this.f15411 = context;
                        method2 = method;
                        break;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            method2.invoke(this.f15411, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
