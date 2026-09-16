package p000;

import android.R;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import java.util.List;

/* JADX INFO: renamed from: ۥۖؒٝؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2048 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C1004 f6756;

    /* JADX INFO: renamed from: ۥۗ */
    public final C1004 f6757;

    /* JADX INFO: renamed from: ۥۣ */
    public final C4938 f6758;

    /* JADX INFO: renamed from: ۦؑ */
    public final View f6759;

    public C2048(C4938 c4938, C1004 c1004, C1004 c1005, View view) {
        this.f6758 = c4938;
        this.f6757 = c1004;
        this.f6756 = c1005;
        this.f6759 = view;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m3992(Menu menu) {
        int i;
        int i2;
        C1197 c1197 = (C1197) this.f6757.mo449();
        final int i3 = 0;
        if (AbstractC3831.m6874(c1197, null)) {
            return false;
        }
        menu.clear();
        List list = c1197.f4126;
        int size = list.size();
        final int i4 = 1;
        int i5 = 0;
        int i6 = 1;
        int i7 = 1;
        while (i5 < size) {
            AbstractC2395 abstractC2395 = (AbstractC2395) list.get(i5);
            if (abstractC2395 instanceof C3064) {
                i = i6 + 1;
                Object obj = abstractC2395.f7967;
                if (AbstractC3831.m6874(obj, AbstractC0993.f3546)) {
                    i2 = R.id.cut;
                } else if (AbstractC3831.m6874(obj, AbstractC0993.f3543)) {
                    i2 = R.id.copy;
                } else if (AbstractC3831.m6874(obj, AbstractC0993.f3544)) {
                    i2 = R.id.paste;
                } else if (AbstractC3831.m6874(obj, AbstractC0993.f3542)) {
                    i2 = R.id.selectAll;
                } else {
                    i2 = AbstractC3831.m6874(obj, AbstractC0993.f3537) ? R.id.autofill : i6;
                }
                final C3064 c3064 = (C3064) abstractC2395;
                MenuItem menuItemAdd = menu.add(i7, i2, i6, c3064.f10303);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: ۦۣۢؔؓ
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                        int i8 = i3;
                        Object obj2 = this;
                        Object obj3 = c3064;
                        switch (i8) {
                            case 0:
                                ((C3064) obj3).f10304.mo211(((C2048) obj2).f6758);
                                break;
                            default:
                                Context context = (Context) obj3;
                                TextClassification textClassification = (TextClassification) obj2;
                                String text = textClassification.getText();
                                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                                if (Build.VERSION.SDK_INT < 34) {
                                    activity.send();
                                } else {
                                    try {
                                        activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                    } catch (PendingIntent.CanceledException e) {
                                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                                    }
                                }
                                break;
                        }
                        return true;
                    }
                });
            } else {
                if (abstractC2395 instanceof C2102) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i = i6 + 1;
                        final Context context = this.f6759.getContext();
                        C2102 c2102 = (C2102) abstractC2395;
                        final TextClassification textClassification = c2102.f6922;
                        int i8 = c2102.f6921;
                        if (i8 < 0) {
                            MenuItem menuItemAdd2 = menu.add(R.id.textAssist, R.id.textAssist, i6, textClassification.getLabel());
                            menuItemAdd2.setShowAsAction(2);
                            menuItemAdd2.setIcon(textClassification.getIcon());
                            menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: ۦۣۢؔؓ
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    int i9 = i4;
                                    Object obj2 = textClassification;
                                    Object obj3 = context;
                                    switch (i9) {
                                        case 0:
                                            ((C3064) obj3).f10304.mo211(((C2048) obj2).f6758);
                                            break;
                                        default:
                                            Context context2 = (Context) obj3;
                                            TextClassification textClassification2 = (TextClassification) obj2;
                                            String text = textClassification2.getText();
                                            PendingIntent activity = PendingIntent.getActivity(context2, text != null ? text.hashCode() : 0, textClassification2.getIntent(), 201326592);
                                            if (Build.VERSION.SDK_INT < 34) {
                                                activity.send();
                                            } else {
                                                try {
                                                    activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                                } catch (PendingIntent.CanceledException e) {
                                                    Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                                                }
                                            }
                                            break;
                                    }
                                    return true;
                                }
                            });
                        } else {
                            int i9 = i8 == 0 ? 1 : i3;
                            final RemoteAction remoteAction = (RemoteAction) textClassification.getActions().get(i8);
                            MenuItem menuItemAdd3 = menu.add(R.id.textAssist, i9 != 0 ? 16908353 : i3, i6, remoteAction.getTitle());
                            menuItemAdd3.setShowAsAction(i9 == 0 ? 0 : 2);
                            if (i9 != 0 || remoteAction.shouldShowIcon()) {
                                menuItemAdd3.setIcon(remoteAction.getIcon().loadDrawable(context));
                            }
                            menuItemAdd3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: ۦۥٖٜؑ
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    PendingIntent actionIntent = remoteAction.getActionIntent();
                                    if (Build.VERSION.SDK_INT < 34) {
                                        actionIntent.send();
                                        return true;
                                    }
                                    try {
                                        actionIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                    } catch (PendingIntent.CanceledException e) {
                                        Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e);
                                    }
                                    return true;
                                }
                            });
                        }
                    }
                } else if (abstractC2395 instanceof C1727) {
                    i7++;
                }
                i5++;
                i3 = 0;
            }
            i6 = i;
            i5++;
            i3 = 0;
        }
        return true;
    }
}
