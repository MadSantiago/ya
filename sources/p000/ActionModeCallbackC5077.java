package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦۣۘؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ActionModeCallbackC5077 implements ActionMode.Callback {

    /* JADX INFO: renamed from: ۥؗ */
    public Class f16834;

    /* JADX INFO: renamed from: ۥُ */
    public boolean f16835;

    /* JADX INFO: renamed from: ۥّ */
    public boolean f16836 = false;

    /* JADX INFO: renamed from: ۥۗ */
    public final TextView f16837;

    /* JADX INFO: renamed from: ۥۣ */
    public final ActionMode.Callback f16838;

    /* JADX INFO: renamed from: ۦؑ */
    public Method f16839;

    public ActionModeCallbackC5077(ActionMode.Callback callback, TextView textView) {
        this.f16838 = callback;
        this.f16837 = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f16838.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f16838.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f16838.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        String str;
        TextView textView = this.f16837;
        Context context = textView.getContext();
        PackageManager packageManager = context.getPackageManager();
        boolean z = this.f16836;
        Class cls = Integer.TYPE;
        if (!z) {
            this.f16836 = true;
            try {
                Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f16834 = cls2;
                this.f16839 = cls2.getDeclaredMethod("removeItemAt", cls);
                this.f16835 = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.f16834 = null;
                this.f16839 = null;
                this.f16835 = false;
            }
        }
        try {
            Method declaredMethod = (this.f16835 && this.f16834.isInstance(menu)) ? this.f16839 : menu.getClass().getDeclaredMethod("removeItemAt", cls);
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                        }
                    }
                    arrayList.add(resolveInfo);
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i);
                MenuItem menuItemAdd = menu.add(0, 0, i + 100, resolveInfo2.loadLabel(packageManager));
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                menuItemAdd.setIntent(intentPutExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.f16838.onPrepareActionMode(actionMode, menu);
    }
}
