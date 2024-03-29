from enigma import getDesktop
from Plugins.Plugin import PluginDescriptor
from .Weather import MeteoMain
from . import _


def main(session, **kwargs):
	session.open(MeteoMain)


def Plugins(**kwargs):
	screenwidth = getDesktop(0).size().width()
	if screenwidth and screenwidth == 1920:
		list = [PluginDescriptor(name=_("Yahoo Weather"), description=_("5 Day Weather Forecast"), where=[PluginDescriptor.WHERE_PLUGINMENU, PluginDescriptor.WHERE_EXTENSIONSMENU], icon="pluginhd.png", fnc=main)]
	else:
		list = [PluginDescriptor(name=_("Yahoo Weather"), description=_("5 Day Weather Forecast"), where=[PluginDescriptor.WHERE_PLUGINMENU, PluginDescriptor.WHERE_EXTENSIONSMENU], icon="plugin.png", fnc=main)]
	return list
